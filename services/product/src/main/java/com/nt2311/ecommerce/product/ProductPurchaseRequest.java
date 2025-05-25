package com.nt2311.ecommerce.product;

import jakarta.validation.constraints.NotNull;

/** ProductPurchaseRequest */
public record ProductPurchaseRequest(
    @NotNull(message = "Product id is required") Integer productId,
    @NotNull(message = "Product quantity is required") Double quantity) {
}
