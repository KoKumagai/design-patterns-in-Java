package creational.abstractFactory.factory;

import creational.abstractFactory.product.Browser;
import creational.abstractFactory.product.GoogleChrome;
import creational.abstractFactory.product.MicrosoftEdge;
import creational.abstractFactory.product.Safari;
import creational.abstractFactory.product.Os;

public class BrowserFactory extends AbstractFactory {

    @Override
    public Browser getBrowser(String browserType) {
        if (browserType == null) {
            return null;
        } else switch (browserType.toUpperCase()) {
            case "GOOGLECHROME":
                return new GoogleChrome();
            case "MICROSOFTEDGE":
                return new MicrosoftEdge();
            case "SAFARI":
                return new Safari();
            default:
                return null;
        }
    }

    @Override
    public Os getOs(String osType) {
        return null;
    }

}