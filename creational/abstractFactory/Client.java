package creational.abstractFactory;

import creational.abstractFactory.product.Browser;
import creational.abstractFactory.factory.AbstractFactory;
import creational.abstractFactory.factory.FactoryProducer;
import creational.abstractFactory.product.Os;

public class Client {

    public static void main(String[] args) {
        AbstractFactory osFactory = FactoryProducer.getFactory("OS");

        Os linux = osFactory.getOs("linux");
        linux.execute(); // Linux is executing programs.

        Os osx = osFactory.getOs("OSX");
        osx.execute(); // OS X is executing programs.

        Os windows = osFactory.getOs("Windows");
        windows.execute(); // Windows is executing programs.


        AbstractFactory browserFactory = FactoryProducer.getFactory("Browser");

        Browser googleChrome = browserFactory.getBrowser("GoogleChrome");
        googleChrome.render(); // Google Chrome is rendering a website.

        Browser microsoftEdge = browserFactory.getBrowser("MicrosoftEdge");
        microsoftEdge.render(); // Microsoft Edge is rendering a website.

        Browser safari = browserFactory.getBrowser("Safari");
        safari.render(); // Safari is rendering a website.
    }

}