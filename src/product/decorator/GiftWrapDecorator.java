package product.decorator;

import product.IProduct;

public class GiftWrapDecorator extends ProductDecorator {

    public GiftWrapDecorator(IProduct wrappee) {
        super(wrappee);
    }

    @Override
    public int getPrice() {
        return super.getPrice() + 500; // добавляем стоимость упаковки
    }

    @Override
    public void display() {
        super.display();
        System.out.println("Gift wrap added!");
    }
}
