package creational.abstractFactory.factory;

import creational.abstractFactory.product.Browser;
import creational.abstractFactory.product.Os;

public abstract class AbstractFactory {

    public abstract Os getOs(String osType);

    public abstract Browser getBrowser(String browserType);

}