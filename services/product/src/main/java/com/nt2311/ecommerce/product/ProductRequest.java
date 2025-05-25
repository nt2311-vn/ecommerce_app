package com.nt2311.ecommerce.product;

import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;
import java.math.BigDecimal;

/** ProductRequest */
public record ProductRequest(
    Integer id,
    @NotNull(message = "name of product is required") String name,
    @NotNull(message = "description of product is required") String description,
    @Positive(message = "available quantity must be greater than 0") Double availableQuantity,
    @Positive(message = "price must be postive") BigDecimal price,
    @NotNull(message = "category is required") Integer categoryId) {
}
