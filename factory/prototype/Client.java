package factory.prototype;

public class Client {
    public static void main(String[] args) {
        Cache.loadCache();

        Prototype clonedPrototype1 = (Prototype)Cache.getPrototype(1);
        clonedPrototype1.execute();

        Prototype clonedPrototype2 = (Prototype)Cache.getPrototype(2);
        clonedPrototype2.execute();
    }
}