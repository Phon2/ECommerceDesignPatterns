package factory;

import product.Clothing;
import product.IProduct;

public class ClothingFactory extends ProductFactory {
    @Override
    public IProduct createProduct(String name, int price, int stock) {
        return new Clothing(name, price, stock);
    }
}
