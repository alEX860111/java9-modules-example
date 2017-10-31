package net.brainified.app;

import java.util.List;

import net.brainified.database.Product;
import net.brainified.domain.ProductService;

public final class Main {

  public static void main(String[] args) {
    final ProductService productService = new ProductService();

    final List<Product> products = productService.getProducts();

    System.out.println(products);
  }

}
