package patterns.hw30.abstractFactory;

public class InstagramFactory implements SocialNetworkFactory {
    public SocialNetwork createSocialNetwork() {
        return new Instagram();
    }
}
