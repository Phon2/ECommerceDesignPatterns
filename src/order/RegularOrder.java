package order;

import product.*;

import java.util.*;


public class RegularOrder implements IOrder{
    private final List<IProduct> products = new ArrayList<>();
    private IPaymentStrategy paymentStrategy;
    private IDiscountStrategy discountStrategy;

    public void setPaymentStrategy(IPaymentStrategy paymentStrategy){
        this.paymentStrategy = paymentStrategy;
    }

    public void setDiscountStrategy(IDiscountStrategy discountStrategy){
        this.discountStrategy = discountStrategy;
    }

    public void addProduct(IProduct p){
        this.products.add(p);
    }

    public void removeProduct(IProduct p){
        this.products.remove(p);
    }

    public List<IProduct> getProducts(){
        return this.products;
    }

    @Override
    public int getOrderCost(){

        if (this.paymentStrategy == null){
            System.err.println("paymentStrategy is not specified");
            return -1;
        }

        int total = 0;
        for (IProduct p : products){
            total += p.getPrice();
        }
        return discountStrategy != null ? discountStrategy.getPrice(paymentStrategy.getPrice(total)) : paymentStrategy.getPrice(total);
    }

    @Override
    public void displayOrder() {
        for (IProduct i : products){
            i.display();
        }
        this.paymentStrategy.displayPayInfo();
        if (discountStrategy != null){
            discountStrategy.displayDiscountInfo();
        }
        System.out.println("Total cost is " + this.getOrderCost());
    }
}
