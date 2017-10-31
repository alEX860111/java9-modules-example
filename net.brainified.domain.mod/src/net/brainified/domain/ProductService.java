package net.brainified.domain;

import java.util.List;
import java.util.stream.Collectors;

import net.brainified.database.Product;
import net.brainified.database.ProductDao;

public final class ProductService {

  private final ProductDao productDao;

  public ProductService() {
    this.productDao = new ProductDao();;
  }

  public List<Product> getProducts() {
    return productDao.loadProducts()
        .stream()
        .filter(Product::getAvailable)
        .collect(Collectors.toList());
  }

}
