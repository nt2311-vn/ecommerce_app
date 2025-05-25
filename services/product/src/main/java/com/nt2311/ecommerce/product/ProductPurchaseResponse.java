package com.nt2311.ecommerce.product;

import java.math.BigDecimal;

/** ProductPurchaseResponse */
public record ProductPurchaseResponse(
    Integer productId, String name, String description, BigDecimal price, double quantity) {
}
