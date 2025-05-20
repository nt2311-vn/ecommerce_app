package com.nt2311.ecommerce.customer;

import lombok.Builder;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Builder
@Document
/** Customer */
public class Customer {
  @Id
  private String id;
  private String firstName;
  private String lastName;
  private String email;
  private Address address;

  public Customer() {
  }

  public Customer(String id, String firstName, String lastName, String email, Address address) {
    this.id = id;
    this.firstName = firstName;
    this.lastName = lastName;
    this.email = email;
    this.address = address;
  }

  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public String getFirstName() {
    return firstName;
  }

  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  public String getLastName() {
    return lastName;
  }

  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public Address getAddress() {
    return address;
  }

  public void setAddress(Address address) {
    this.address = address;
  }

  public static class Builder {
    private String id;
    private String firstName;
    private String lastName;
    private String email;
    private Address address;

    public Builder id(String id) {
      this.id = id;
      return this;
    }

    public Builder firstName(String firstName) {
      this.firstName = firstName;
      return this;
    }

    public Builder lastName(String lastName) {
      this.lastName = lastName;
      return this;
    }

    public Builder email(String email) {
      this.email = email;
      return this;
    }

    public Builder address(Address address) {
      this.address = address;
      return this;
    }

    public Customer build() {
      return new Customer(id, firstName, lastName, email, address);
    }
  }

  public static Builder builder() {
    return new Builder();
  }
}
