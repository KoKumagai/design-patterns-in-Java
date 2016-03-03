package creational.abstractFactory.factory;

import creational.abstractFactory.browser.Browser;
import creational.abstractFactory.os.Linux;
import creational.abstractFactory.os.Os;
import creational.abstractFactory.os.Osx;
import creational.abstractFactory.os.Windows;

public class OsFactory extends AbstractFactory {

    @Override
    public Os getOs(String osType) {
        if (osType == null) {
            return null;
        } else switch (osType.toUpperCase()) {
            case "LINUX":
                return new Linux();
            case "OSX":
                return new Osx();
            case "WINDOWS":
                return new Windows();
            default:
                return null;
        }
    }

    @Override
    public Browser getBrowser(String browser) {
        return null;
    }

}