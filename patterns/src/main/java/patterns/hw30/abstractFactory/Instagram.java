package patterns.hw30.abstractFactory;

public class Instagram implements SocialNetwork {
    public void post(String message) {
        System.out.println("Post in Insta: " + message);
    }
}
