package com.nt2311.ecommerce.handler;

import com.nt2311.ecommerce.exception.ProductPurchaseException;
import jakarta.persistence.EntityNotFoundException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

/** GlobalExceptionHandler */
@RestControllerAdvice
public class GlobalExceptionHandler {

  @ExceptionHandler(ProductPurchaseException.class)
  public ResponseEntity<String> handle(ProductPurchaseException exp) {
    return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(exp.getMessage());
  }

  @ExceptionHandler(EntityNotFoundException.class)
  public ResponseEntity<String> handle(EntityNotFoundException exp) {

    return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(exp.getMessage());
  }
}
