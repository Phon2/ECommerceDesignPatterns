package product.decorator;

import product.IProduct;

public class ExpressDeliveryDecorator extends ProductDecorator {

    public ExpressDeliveryDecorator(IProduct wrappee) {
        super(wrappee);
    }

    @Override
    public int getPrice() {
        return super.getPrice() + 2000;
    }

    @Override
    public void display() {
        super.display();
        System.out.println("Express delivery added!");
    }
}
