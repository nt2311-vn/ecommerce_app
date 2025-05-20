package com.nt2311.ecommerce.customer;

import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.validation.annotation.Validated;

/** Address */
@Document
@Validated
public class Address {
  private String address;
  private String houseNumber;
  private String zipCode;

  public Address() {
  }

  public Address(String address, String houseNumber, String zipCode) {
    this.address = address;
    this.houseNumber = houseNumber;
    this.zipCode = zipCode;
  }

  public void setAddress(String address) {
    this.address = address;
  }

  public String getAddress() {
    return address;
  }

  public void setHouseNumber(String houseNumber) {
    this.houseNumber = houseNumber;
  }

  public String getHouseNumber() {
    return houseNumber;
  }

  public String getZipCode() {
    return zipCode;
  }

  public void setZipCode(String zipCode) {
    this.zipCode = zipCode;
  }

  public static class Builder {
    private String address;
    private String houseNumber;
    private String zipCode;

    public Builder address(String address) {
      this.address = address;
      return this;
    }

    public Builder houseNumber(String houseNumber) {
      this.houseNumber = houseNumber;
      return this;
    }

    public Builder zipCode(String zipCode) {
      this.zipCode = zipCode;
      return this;
    }

    public Address build() {
      return new Address(address, houseNumber, zipCode);
    }
  }

  public static Builder builder() {
    return new Builder();
  }
}
