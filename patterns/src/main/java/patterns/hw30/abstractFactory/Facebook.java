package patterns.hw30.abstractFactory;

public class Facebook implements SocialNetwork {
    public void post(String message) {
        System.out.println("Post in Facebook: " + message);
    }
}

