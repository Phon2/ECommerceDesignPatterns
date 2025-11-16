package store;

import java.util.*;

import factory.ProductFactory;
import user.*;
import product.*;

public class OnlineStore implements IStore {

    private final ArrayList<IProduct> products = new ArrayList<>();
    private final Map<IProduct, List<IUser>> subscriptions = new HashMap<>();

    public void addProduct(ProductFactory factory, String name, int price, int stock) {
        IProduct product = factory.createProduct(name, price, stock);
        products.add(product);
        subscriptions.put(product, new ArrayList<>());
    }

    @Override
    public void subscribe(IUser user, IProduct product) {
        if (subscriptions.containsKey(product)) {
            List<IUser> users = subscriptions.get(product);
            if (!users.contains(user)) {
                users.add(user);
            }
        }
    }

    @Override
    public void unsubscribe(IUser user, IProduct product) {
        subscriptions.get(product).remove(user);
    }

    @Override
    public void notifyUsers(IProduct product) {
        if (subscriptions.containsKey(product)) {
            for (IUser user : subscriptions.get(product)) {
                user.update(product.getName(), product.getPrice(), product.getStock());
            }
        }
    }

    @Override
    public void updatePrice(IProduct product, int newPrice) {
        product.setPrice(newPrice);
        System.out.println("\n[Store] Price updated for " + product.getName() + ": $" + newPrice);
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
