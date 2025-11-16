package order.discounts;

import order.IDiscountStrategy;

public class BlackFridayDiscount implements IDiscountStrategy {
    public void displayDiscountInfo(){
        System.out.println("Black Friday discount (30%) applied!");
    };
    public int getPrice(int iniPrice){
        return (int)(iniPrice * 0.7);
    };
}
