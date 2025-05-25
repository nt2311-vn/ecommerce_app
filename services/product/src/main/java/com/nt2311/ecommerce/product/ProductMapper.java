package com.nt2311.ecommerce.product;

import com.nt2311.ecommerce.category.Category;
import org.springframework.stereotype.Service;

/** ProductMapper */
@Service
public class ProductMapper {

  public Product toProduct(ProductRequest request) {
    return Product.builder()
        .id(request.id())
        .name(request.name())
        .description(request.description())
        .availableQuantity(request.availableQuantity())
        .price(request.price())
        .category(Category.builder().id(request.categoryId()).build())
        .build();
  }

  public ProductResponse toProductResponse(Product product) {
    return new ProductResponse(
        product.getId(),
        product.getName(),
        product.getDescription(),
        product.getAvailableQuantity(),
        product.getPrice(),
        product.getCategory().getId(),
        product.getCategory().getName(),
        product.getCategory().getDescription());
  }
}
