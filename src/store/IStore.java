package store;

import product.IProduct;
import user.*;
import factory.*;

public interface IStore {
    void subscribe(IUser user, IProduct product);
    void unsubscribe(IUser user, IProduct product);
    void notifyUsers(IProduct product);
    void addProduct(ProductFactory factory, String name, int price, int stock);
    void updatePrice(IProduct product, int newPrice);
    void updateStock(IProduct product, int newStock);
    IProduct getProductByName(String name);
}