import facade.StoreFacade;
import order.discounts.*;
import order.payments.*;
import product.IProduct;
import product.decorator.*;
import user.*;

public class Main {

    public static void main(String[] args) {

        StoreFacade facade = new StoreFacade();

        ConcreteUser zarina = facade.createUser("Zarina", "010203", "zarina@email.com");
        ConcreteUser murat = facade.createUser("Murat", "mura67", "murat@email.com");

        IProduct tshirtBlue = facade.addClothing("T-Shirt blue", 3000, 10);
        IProduct laptopSilver = facade.addElectronics("Laptop silver", 120000, 5);

        facade.subscribeUser(zarina, tshirtBlue);
        facade.subscribeUser(murat, laptopSilver);

        IProduct wrappedLaptopSilver = new GiftWrapDecorator(laptopSilver);
        IProduct expressTShirtBlue = new ExpressDeliveryDecorator(tshirtBlue);

        facade.addProductToOrder(zarina, wrappedLaptopSilver);
        facade.addProductToOrder(zarina, expressTShirtBlue);

        facade.setPaymentStrategy(zarina, new CreditCardPayment("1234-5678-9012-3456"));
        facade.setDiscountStrategy(zarina, new BlackFridayDiscount());

        System.out.println("\n--- Zarina's order ---");
        facade.displayOrder(zarina);

        System.out.println("\n--- Store Updates ---");
        facade.updatePrice(tshirtBlue, 3500);
        facade.updateStock(laptopSilver, 3);
    }
}
