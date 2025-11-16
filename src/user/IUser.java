package user;

public interface IUser {
    String getUsername();

    String getPassword();

    void setUsername(String username);

    void setPassword(String password);

    void display();

    void update(String productName, int newPrice, int newStock);

}
