package com.nt2311.ecommerce.customer;

import jakarta.validation.Valid;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/** CustomerController */
@RestController
@RequestMapping("/api/v1/customers")
public class CustomerController {

  private final CustomerService service;

  public CustomerController(CustomerService service) {
    this.service = service;
  }

  @PostMapping
  public ResponseEntity<String> createCustomer(@RequestBody @Valid CustomerRequest request) {

    return ResponseEntity.ok(service.createCustomer(request));
  }

  @PutMapping
  public ResponseEntity<Void> updateCustomer(@RequestBody @Valid CustomerRequest request) {
    service.updateCustomer(request);
    return ResponseEntity.accepted().build();
  }

  @GetMapping
  public ResponseEntity<List<CustomerResponse>> findAdd() {
  }
}
