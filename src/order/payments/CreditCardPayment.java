package order.payments;

import order.IPaymentStrategy;

public class CreditCardPayment implements IPaymentStrategy {
    private String cardNumber;

    public CreditCardPayment(String cardNumber){
        this.cardNumber = cardNumber;
    }

    @Override
    public String getPaymentType(){
        return "Credit Card";
    }

    @Override
    public int getPrice(int iniPrice){
        return iniPrice + 150;
    }

    @Override
    public void displayPayInfo(){
        System.out.println("Payment using " + getPaymentType() + " " + this.cardNumber);
    }
}
