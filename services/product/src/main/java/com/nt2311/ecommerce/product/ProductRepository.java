package com.nt2311.ecommerce.product;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;

/** ProductRepository */
public interface ProductRepository extends JpaRepository<Product, Integer> {

  List<Product> findAllByIdOrderById(List<Integer> productIds);
}
