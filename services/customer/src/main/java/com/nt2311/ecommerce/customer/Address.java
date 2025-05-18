package com.nt2311.ecommerce.customer;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.validation.annotation.Validated;

/** Address */
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
@Setter
@Document
@Validated
public class Address {
  private String address;
  private String houseNumber;
  private String zipCode;
}
