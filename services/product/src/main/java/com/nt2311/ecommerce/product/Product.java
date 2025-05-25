package com.nt2311.ecommerce.product;

import com.nt2311.ecommerce.category.Category;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import java.math.BigDecimal;

/** Product */
@Entity
public class Product {
  @Id
  @GeneratedValue
  private Integer id;
  private String name;
  private String description;
  private Double availableQuantity;
  private BigDecimal price;

  @ManyToOne
  @JoinColumn(name = "category_id")
  private Category category;

  public Product() {
  }

  public Product(
      Integer id,
      String name,
      String description,
      Double availableQuantity,
      BigDecimal price,
      Category category) {
    this.id = id;
    this.name = name;
    this.description = description;
    this.availableQuantity = availableQuantity;
    this.price = price;
    this.category = category;
  }

  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public Double getAvailableQuantity() {
    return availableQuantity;
  }

  public void setAvailableQuantity(Double availableQuantity) {
    this.availableQuantity = availableQuantity;
  }

  public BigDecimal getPrice() {
    return price;
  }

  public void setPrice(BigDecimal price) {
    this.price = price;
  }

  public Category getCategory() {
    return category;
  }

  public void setCategory(Category category) {
    this.category = category;
  }

  public static class Builder {
    private Integer id;
    private String name;
    private String description;
    private Double availableQuantity;
    private BigDecimal price;
    private Category category;

    public Builder id(Integer id) {
      this.id = id;
      return this;
    }

    public Builder name(String name) {
      this.name = name;
      return this;
    }

    public Builder description(String description) {
      this.description = description;
      return this;
    }

    public Builder availableQuantity(Double availableQuantity) {
      this.availableQuantity = availableQuantity;
      return this;
    }

    public Builder price(BigDecimal price) {
      this.price = price;
      return this;
    }

    public Builder category(Category category) {
      this.category = category;
      return this;
    }

    public Product build() {
      return new Product(id, name, description, availableQuantity, price, category);
    }
  }

  public static Builder builder() {
    return new Builder();
  }
}
