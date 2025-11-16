package user;

public interface IUserBuilder {
    IUserBuilder setUsername(String username);
    IUserBuilder setPassword(String password);
    IUser build();
}
