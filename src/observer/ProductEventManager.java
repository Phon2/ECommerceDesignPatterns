package observer;

import user.IUser;
import product.IProduct;

import java.util.*;

public class ProductEventManager {

    private final Map<IProduct, List<IUser>> subscriptions = new HashMap<>();

    public void addProduct(IProduct product) {
        subscriptions.put(product, new ArrayList<>());
    }

    public void subscribe(IUser user, IProduct product) {
        if (subscriptions.containsKey(product)) {
            List<IUser> users = subscriptions.get(product);
            if (!users.contains(user)) {
                users.add(user);
            }
        }
    }

    public void unsubscribe(IUser user, IProduct product) {
        if (subscriptions.containsKey(product)) {
            subscriptions.get(product).remove(user);
        }
    }

    public void notifyUsers(IProduct product) {
        if (subscriptions.containsKey(product)) {
            for (IUser user : subscriptions.get(product)) {
                user.update(product.getName(), product.getPrice(), product.getStock());
            }
        }
    }
}
