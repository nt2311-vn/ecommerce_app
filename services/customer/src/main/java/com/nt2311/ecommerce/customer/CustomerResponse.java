package com.nt2311.ecommerce.customer;

/** CustomerResponse */
public record CustomerResponse(
    String id, String firstName, String lastName, String email, Address address) {
}
