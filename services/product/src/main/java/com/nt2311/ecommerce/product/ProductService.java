package com.nt2311.ecommerce.product;

import com.nt2311.ecommerce.exception.ProductPurchaseException;
import jakarta.persistence.EntityNotFoundException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import org.springframework.stereotype.Service;

/** ProductService */
@Service
public class ProductService {

  private final ProductRepository repository;
  private final ProductMapper mapper;

  public ProductService(ProductRepository repository, ProductMapper mapper) {
    this.mapper = mapper;
    this.repository = repository;
  }

  public Integer createProduct(ProductRequest request) {
    var product = mapper.toProduct(request);
    return repository.save(product).getId();
  }

  public List<ProductPurchaseResponse> purchaseProducts(List<ProductPurchaseRequest> request) {
    var productIds = request.stream().map(ProductPurchaseRequest::productId).toList();
    var storedProducts = repository.findAllByIdOrderById(productIds);

    if (productIds.size() != storedProducts.size()) {
      throw new ProductPurchaseException("One more products does not exist");
    }

    var storedRequest = request.stream().sorted(Comparator.comparing(ProductPurchaseRequest::productId)).toList();
    var purchasedProducts = new ArrayList<ProductPurchaseResponse>();

    for (int i = 0; i < storedProducts.size(); i++) {
      var product = storedProducts.get(i);
      var productRequest = storedRequest.get(i);

      if (product.getAvailableQuantity() < productRequest.quantity()) {
        throw new ProductPurchaseException(
            "Insufficent stock quantity for product with ID:: " + productRequest.productId());
      }
    }
  }

  public ProductResponse findById(Integer productId) {
    return repository
        .findById(productId)
        .map(mapper::toProductResponse)
        .orElseThrow(
            () -> new EntityNotFoundException("Product not found with the ID:: " + productId));
  }

  public List<ProductResponse> findAll() {
    return repository.findAll().stream()
        .map(mapper::toProductResponse)
        .collect(Collectors.toList());
  }
}
