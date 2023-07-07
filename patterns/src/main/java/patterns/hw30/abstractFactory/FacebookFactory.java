package patterns.hw30.abstractFactory;

public class FacebookFactory implements SocialNetworkFactory {
    public SocialNetwork createSocialNetwork() {
        return new Facebook();
    }
}
