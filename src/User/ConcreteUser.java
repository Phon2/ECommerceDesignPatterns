package User;

public class ConcreteUser implements IUser{
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

    String getEmail() {
        return this.email;
    }

    String getPhone() {
        return this.phone;
    }

    String getAddress() {
        return this.address;
    }

    String getCity() {
        return this.city;
    }

    String getState() {
        return this.state;
    }

    String getCountry() {
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

    void setEmail(String email) {
        this.email = email;
    }

    void setPhone(String phone) {
        this.phone = phone;
    }

    void setAddress(String address) {
        this.address = address;
    }

    void setCity(String city) {
        this.city = city;
    }

    void setState(String state) {
        this.state = state;
    }

    void setCountry(String country) {
        this.country = country;
    }

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

}
