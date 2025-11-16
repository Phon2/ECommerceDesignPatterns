package order;

public interface IDiscountStrategy {
    void displayDiscountInfo();
    int getPrice(int iniPrice);
}
