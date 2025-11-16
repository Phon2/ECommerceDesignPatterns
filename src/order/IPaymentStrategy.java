package order;

public interface IPaymentStrategy {
    String getPaymentType();
    int getPrice(int iniPrice);
    void displayPayInfo();
}
