package user;

public class ConcreteBuilder implements IUserBuilder {

    private ConcreteUser user = new ConcreteUser();

    void reset(){
        this.user = new ConcreteUser();
    }

    @Override
    public IUserBuilder setUsername(String username) {
        this.user.setUsername(username);
        return this;
    }

    @Override
    public IUserBuilder setPassword(String password) {
        this.user.setPassword(password);
        return this;
    }

    public IUserBuilder setEmail(String email) {
        this.user.setEmail(email);
        return this;
    }

    public IUserBuilder setPhone(String phone) {
        this.user.setPhone(phone);
        return this;
    }

    public IUserBuilder setAddress(String address) {
        this.user.setAddress(address);
        return this;
    }

    public IUserBuilder setCity(String city) {
        this.user.setCity(city);
        return this;
    }

    public IUserBuilder setCountry(String country) {
        this.user.setCountry(country);
        return this;
    }

    public IUserBuilder setState(String state) {
        this.user.setState(state);
        return this;
    }

    @Override
    public ConcreteUser build() {
        return this.user;
    }
}
