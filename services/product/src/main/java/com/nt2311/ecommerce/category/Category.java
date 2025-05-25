package com.nt2311.ecommerce.category;

import com.nt2311.ecommerce.product.Product;
import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import java.util.List;

/** Category */
@Entity
public class Category {
  @Id
  @GeneratedValue
  private Integer id;
  private String name;
  private String description;

  @OneToMany(mappedBy = "category", cascade = CascadeType.REMOVE)
  private List<Product> products;

  public Category() {
  }

  public Category(Integer id, String name, String description, List<Product> products) {
    this.id = id;
    this.name = name;
    this.description = description;
    this.products = products;
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

  public List<Product> getProducts() {
    return products;
  }

  public void setProducts(List<Product> products) {
    this.products = products;
  }
}
