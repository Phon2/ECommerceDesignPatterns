package factory;

import product.IProduct;

public abstract class ProductFactory {
    public abstract IProduct createProduct(String name, int price, int stock);
}
