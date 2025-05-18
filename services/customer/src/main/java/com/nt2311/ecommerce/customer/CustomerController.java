package com.nt2311.ecommerce.customer;

import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/** CustomerController */
@RestController
@RequestMapping("/api/v1/customers")
@RequiredArgsConstructor
public class CustomerController {

  private final CustomerService service;

  @PostMapping
  public ResponseEntity<String> createCustomer(@RequestBody @Valid CustomerRequest request) {

    return ResponseEntity.ok(service.createCustomer(request));
  }
}
