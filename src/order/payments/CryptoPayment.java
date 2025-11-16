package order.payments;

import order.IPaymentStrategy;

public class CryptoPayment implements IPaymentStrategy {
    private String wallet;

    public CryptoPayment(String wallet){
        this.wallet = wallet;
    }

    @Override
    public String getPaymentType(){
        return "Crypto Wallet";
    }

    @Override
    public int getPrice(int iniPrice){
        return iniPrice;
    }

    @Override
    public void displayPayInfo(){
        System.out.println("Payment using " + getPaymentType() + " " + this.wallet);
    }
}
