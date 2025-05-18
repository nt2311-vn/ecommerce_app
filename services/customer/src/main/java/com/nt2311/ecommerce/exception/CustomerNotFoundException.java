package com.nt2311.ecommerce.exception;

import lombok.Data;
import lombok.EqualsAndHashCode;

/** CustomerNotFoundException */
@EqualsAndHashCode(callSuper = true)
@Data
public class CustomerNotFoundException extends RuntimeException {
  private final String msg;
}
