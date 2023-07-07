package patterns.hw30.abstractFactory;

import patterns.hw30.abstractFactory.SocialNetwork;

//абстаркная фабрика для создания мессенджеров без привязки к классам
public interface SocialNetworkFactory {
    SocialNetwork createSocialNetwork();
}
