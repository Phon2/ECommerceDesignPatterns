package facade;

import factory.*;
import order.*;
import order.discounts.*;
import order.payments.*;
import product.*;
import product.decorator.*;
import store.*;
import user.*;

public class StoreFacade {

    private final OnlineStore store = new OnlineStore();

    public ConcreteUser createUser(String username, String password, String email) {
        ConcreteBuilder builder = new ConcreteBuilder()
                .setUsername(username)
                .setPassword(password)
                .setEmail(email);
        return builder.build();
    }

    public IProduct addClothing(String name, int price, int stock) {
        ClothingFactory factory = new ClothingFactory();
        store.addProduct(factory, name, price, stock);
        return store.getProductByName(name);
    }

    public IProduct addElectronics(String name, int price, int stock) {
        ElectronicsFactory factory = new ElectronicsFactory();
        store.addProduct(factory, name, price, stock);
        return store.getProductByName(name);
    }

    public void subscribeUser(IUser user, IProduct product) {
        store.subscribe(user, product);
    }

    public void updatePrice(IProduct product, int newPrice) {
        store.updatePrice(product, newPrice);
    }

    public void updateStock(IProduct product, int newStock) {
        store.updateStock(product, newStock);
    }

    public void addProductToOrder(ConcreteUser user, IProduct product) {
        user.addProduct(product);
    }

    public void setPaymentStrategy(ConcreteUser user, IPaymentStrategy payment) {
        user.getUserOrder().setPaymentStrategy(payment);
    }

    public void setDiscountStrategy(ConcreteUser user, IDiscountStrategy discount) {
        user.getUserOrder().setDiscountStrategy(discount);
    }

    public void displayOrder(ConcreteUser user) {
        user.getUserOrder().displayOrder();
    }

}
