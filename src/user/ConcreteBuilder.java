package user;

public class ConcreteBuilder implements IUserBuilder {

    private ConcreteUser user = new ConcreteUser();

    void reset(){
        this.user = new ConcreteUser();
    }

    @Override
    public ConcreteBuilder setUsername(String username) {
        this.user.setUsername(username);
        return this;
    }

    @Override
    public ConcreteBuilder setPassword(String password) {
        this.user.setPassword(password);
        return this;
    }

    public ConcreteBuilder setEmail(String email) {
        this.user.setEmail(email);
        return this;
    }

    public ConcreteBuilder setPhone(String phone) {
        this.user.setPhone(phone);
        return this;
    }

    public ConcreteBuilder setAddress(String address) {
        this.user.setAddress(address);
        return this;
    }

    public ConcreteBuilder setCity(String city) {
        this.user.setCity(city);
        return this;
    }

    public ConcreteBuilder setCountry(String country) {
        this.user.setCountry(country);
        return this;
    }

    public ConcreteBuilder setState(String state) {
        this.user.setState(state);
        return this;
    }

    @Override
    public ConcreteUser build() {
        return this.user;
    }
}
