package com.nt2311.ecommerce.customer;

import org.springframework.stereotype.Service;

/** CustomerMapper */
@Service
public class CustomerMapper {

  public Customer toCustomer(CustomerRequest request) {
    if (request == null) {
      return null;
    }

    return Customer.builder()
        .id(request.id())
        .firstName(request.firstName())
        .lastName(request.lastName())
        .address(request.address())
        .build();
  }
}
