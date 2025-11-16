package store;

import java.util.*;

import factory.ProductFactory;
import user.*;
import product.*;
import observer.*;

public class OnlineStore implements IStore {
    private final ArrayList<IProduct> products = new ArrayList<>();
    private final ProductEventManager eventManager = new ProductEventManager();

    @Override
    public void addProduct(ProductFactory factory, String name, int price, int stock) {
        IProduct product = factory.createProduct(name, price, stock);
        products.add(product);
        eventManager.addProduct(product);
    }

    @Override
    public void subscribe(IUser user, IProduct product) {
        eventManager.subscribe(user, product);
    }

    @Override
    public void unsubscribe(IUser user, IProduct product) {
        eventManager.unsubscribe(user, product);
    }

    @Override
    public void notifyUsers(IProduct product) {
        eventManager.notifyUsers(product);
    }

    @Override
    public void updatePrice(IProduct product, int newPrice) {
        product.setPrice(newPrice);
        System.out.println("\n[Store] Price updated for " + product.getName() + ": " + newPrice + " KZT");
        notifyUsers(product);
    }

    @Override
    public void updateStock(IProduct product, int newStock) {
        product.setStock(newStock);
        System.out.println("\n[Store] Stock updated for " + product.getName() + ": " + newStock);
        notifyUsers(product);
    }

    @Override
    public IProduct getProductByName(String name) {
        for (IProduct product : products) {
            if (product.getName().equals(name)) {
                return product;
            }
        }
        return null;
    }
}
