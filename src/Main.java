import User.*;

public class Main {
    public static void main(String[] args) {
        ConcreteBuilder builder = new ConcreteBuilder();

        builder.setUsername("UlaRora");
        builder.setPassword("s3cur3PasSwOrD2007");

        ConcreteUser user = builder.build();
        user.display();

    }
}