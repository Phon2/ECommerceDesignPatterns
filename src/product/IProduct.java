package product;

public interface IProduct {
    String getName();
    int getPrice();
    int getStock();
    void display();
    void setPrice(int price);
    void setStock(int stock);
}
