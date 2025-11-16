package product;

public class Clothing implements IProduct {
    private String name;
    private int price;
    private int stock;

    public Clothing(String name, int price, int stock) {
        this.name = name;
        this.price = price;
        this.stock = stock;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public int getPrice() {
        return price;
    }

    @Override
    public int getStock() {
        return stock;
    }

    @Override
    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public void setStock(int stock) {
        this.stock = stock;
    }

    @Override
    public void display() {
        System.out.println(this.getClass().getSimpleName() + ": " + name + " | Price: " + price + " KZT");
    }
}
