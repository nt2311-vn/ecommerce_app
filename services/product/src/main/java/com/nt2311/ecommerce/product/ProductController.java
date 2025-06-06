package com.nt2311.ecommerce.product;

import jakarta.validation.Valid;
import java.util.List;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/** ProductController */
@RestController
@RequestMapping("/api/v1/products")
public class ProductController {

  private final ProductService service;

  public ProductController(ProductService service) {
    this.service = service;
  }

  @PostMapping
  public ResponseEntity<Integer> createProduct(@RequestBody @Valid ProductRequest request) {
    return ResponseEntity.ok(service.createProduct(request));
  }

  @PostMapping("/purchase")
  public ResponseEntity<List<ProductPurchaseResponse>> purchaseProducts(
      @RequestBody List<ProductPurchaseRequest> request) {
    return ResponseEntity.ok(service.purchaseProducts(request));
  }

  @GetMapping("/{product-id}")
  public ResponseEntity<ProductResponse> findById(@PathVariable("product-id") Integer productId) {
    return ResponseEntity.ok(service.findById(productId));
  }

  @GetMapping
  public ResponseEntity<List<ProductResponse>> findAll() {
    return ResponseEntity.ok(service.findAll());
  }
}
