package factory;

import product.Electronics;
import product.IProduct;

public class ElectronicsFactory extends ProductFactory {
    @Override
    public IProduct createProduct(String name, int price, int stock) {
        return new Electronics(name, price, stock);
    }
}
