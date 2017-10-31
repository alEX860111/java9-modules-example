package net.brainified.database;

public final class Product {

  private String name;

  private Double price;

  private Boolean available;

  public String getName() {
    return name;
  }

  public void setName(final String name) {
    this.name = name;
  }

  public Double getPrice() {
    return price;
  }

  public void setPrice(final Double price) {
    this.price = price;
  }

  public Boolean getAvailable() {
    return available;
  }

  public void setAvailable(Boolean available) {
    this.available = available;
  }

  @Override
  public String toString() {
    return String.format("[name: %s, price: %s, available: %s]", name, price, available);
  }

}
