package com.nt2311.ecommerce.product;

import java.math.BigDecimal;

/** ProductResponse */
public record ProductResponse(
    Integer id,
    String name,
    String description,
    Double availableQuantity,
    BigDecimal price,
    Integer categoryId,
    String categoryName,
    String categoryDescription) {
}
