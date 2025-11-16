package product.decorator;

import product.IProduct;

public abstract class ProductDecorator implements IProduct {
    protected IProduct wrappee;

    public ProductDecorator(IProduct wrappee) {
        this.wrappee = wrappee;
    }

    @Override
    public String getName() {
        return wrappee.getName();
    }

    @Override
    public int getPrice() {
        return wrappee.getPrice();
    }

    @Override
    public int getStock() {
        return wrappee.getStock();
    }

    @Override
    public void setPrice(int price) {
        wrappee.setPrice(price);
    }

    @Override
    public void setStock(int stock) {
        wrappee.setStock(stock);
    }

    @Override
    public void display() {
        wrappee.display();
    }
}
