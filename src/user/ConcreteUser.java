package user;

import order.RegularOrder;
import product.IProduct;

public class ConcreteUser implements IUser{
    RegularOrder userOrder = new RegularOrder();

    private String username;
    private String password;
    private String email;
    private String phone;
    private String address;
    private String city;
    private String state;
    private String country;

    @Override
    public String getUsername() {
        return this.username;
    }

    @Override
    public String getPassword() {
        return this.password;
    }

    public String getEmail() {
        return this.email;
    }

    public String getPhone() {
        return this.phone;
    }

    public String getAddress() {
        return this.address;
    }

    public String getCity() {
        return this.city;
    }

    public String getState() {
        return this.state;
    }

    public String getCountry() {
        return this.country;
    }

    @Override
    public void setUsername(String username) {
        this.username = username;
    }

    @Override
    public void setPassword(String password) {
        this.password = password;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void setState(String state) {
        this.state = state;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public void addProduct(IProduct product) {
        this.userOrder.addProduct(product);
    }

    public void removeProduct(IProduct product){
        this.userOrder.removeProduct(product);
    }

    public RegularOrder getUserOrder() {
        return this.userOrder;
    }

    @Override
    public void display(){
        System.out.print("Username: " + this.username + "\n");
        System.out.print("Password: " + this.password + "\n");
        System.out.print(this.email != null ? "Email: " + this.email + "\n": "");
        System.out.print(this.phone != null ? "Phone: " + this.phone + "\n": "");
        System.out.print(this.address != null ? "Address: " + this.address + "\n" : "");
        System.out.print(this.city != null ? "City: " + this.city + "\n" : "");
        System.out.print(this.state != null ? "State: " + this.state + "\n" : "");
        System.out.print(this.country != null ? "Country: " + this.country + "\n" : "");
    }

    @Override
    public void update(String productName, int newPrice, int newStock) {
        System.out.println("[Customer: " + this.username + "] Product " + productName +
                " → Price: " + newPrice + " KZT, Stock: " + newStock);
    }

}
