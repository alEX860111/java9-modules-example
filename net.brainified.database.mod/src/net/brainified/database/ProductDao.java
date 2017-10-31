package net.brainified.database;

import java.util.Arrays;
import java.util.List;

public final class ProductDao {

  public List<Product> loadProducts() {
    final Product iphone = new Product();
    iphone.setName("iphone");
    iphone.setPrice(1199d);
    iphone.setAvailable(true);

    final Product ngage = new Product();
    ngage.setName("ngage");
    ngage.setPrice(399d);
    ngage.setAvailable(false);

    final Product galaxy = new Product();
    galaxy.setName("galaxy");
    galaxy.setPrice(699d);
    galaxy.setAvailable(true);

    return Arrays.asList(iphone, ngage, galaxy);
  }

}
