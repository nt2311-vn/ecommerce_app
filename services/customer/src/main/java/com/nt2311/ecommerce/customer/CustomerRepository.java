package com.nt2311.ecommerce.customer;

import org.springframework.data.mongodb.repository.MongoRepository;

/** CustomerRepository */
public interface CustomerRepository extends MongoRepository<Customer, String> {
}
