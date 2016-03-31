package creational.abstractFactory.factory;

import creational.abstractFactory.product.Browser;
import creational.abstractFactory.product.Linux;
import creational.abstractFactory.product.Os;
import creational.abstractFactory.product.Osx;
import creational.abstractFactory.product.Windows;

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