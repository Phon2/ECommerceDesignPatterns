package order.discounts;

import order.IDiscountStrategy;

public class ReturneeDiscount implements IDiscountStrategy {
    public void displayDiscountInfo(){
        System.out.println("Returnee discount (15%) applied!");
    };
    public int getPrice(int iniPrice){
        return (int) (iniPrice * 0.85);
    };
}
