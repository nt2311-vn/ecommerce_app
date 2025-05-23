package com.nt2311.ecommerce.handler;

import java.util.Map;

/** ErrorResponse */
public record ErrorResponse(Map<String, String> errors) {
}
