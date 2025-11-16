import user.*;
import factory.*;
import product.*;
import product.decorator.*;
import store.*;
import order.*;

public class Main {
    public static void main(String[] args) {
        ConcreteBuilder builder = new ConcreteBuilder();

        builder.setUsername("UlaRora");
        builder.setPassword("s3cur3PasSwOrD2007");

        ConcreteUser user = builder.build();
        user.display();

        ProductFactory clothingFactory = new ClothingFactory();
        ProductFactory electronicsFactory = new ElectronicsFactory();

        IProduct tshirt = new GiftWrapDecorator(new ExpressDeliveryDecorator(clothingFactory.createProduct("T-Shirt", 7000, 2)));
        IProduct laptop = new GiftWrapDecorator(new ExpressDeliveryDecorator(electronicsFactory.createProduct("Laptop", 600000, 3)));

        System.out.println("Product 1 (T-Shirt)");
        tshirt.display();
        System.out.println("Total price: " + tshirt.getPrice() + " KZT");

        System.out.println("\nProduct 2 (Laptop)");
        laptop.display();
        System.out.println("Total price: " + laptop.getPrice() + " KZT");

        OnlineStore store = new OnlineStore();

        store.addProduct(clothingFactory, "T-Shirt", 7000, 2);
        store.addProduct(electronicsFactory, "Laptop", 600000, 3);

        IProduct tshirtInStore = store.getProductByName("T-Shirt");
        IProduct laptopInStore = store.getProductByName("Laptop");

        store.subscribe(user, tshirtInStore);
        store.subscribe(user, laptopInStore);

        store.updatePrice(tshirtInStore, 7500);   // пользователь получит уведомление
        store.updateStock(laptopInStore, 5);
    }
}