package creational.abstractFactory.factory;

import creational.abstractFactory.browser.Browser;
import creational.abstractFactory.os.Os;

public abstract class AbstractFactory {

    public abstract Os getOs(String osType);

    public abstract Browser getBrowser(String browserType);

}