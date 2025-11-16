package order.discounts;

import order.IDiscountStrategy;

public class ForFreeDiscount implements IDiscountStrategy {
    public void displayDiscountInfo(){
        System.out.println("This order is 100% free!");
    };
    public int getPrice(int iniPrice){
        return 0;
    };
}
