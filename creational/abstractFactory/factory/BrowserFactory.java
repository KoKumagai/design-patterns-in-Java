package creational.abstractFactory.factory;

import creational.abstractFactory.browser.Browser;
import creational.abstractFactory.browser.GoogleChrome;
import creational.abstractFactory.browser.MicrosoftEdge;
import creational.abstractFactory.browser.Safari;
import creational.abstractFactory.os.Os;

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