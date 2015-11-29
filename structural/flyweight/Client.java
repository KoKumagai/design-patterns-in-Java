package structural.flyweight;

import java.lang.System;

public class Client {

    public static void main(String[] args) {
        FlyweightFactory factory = FlyweightFactory.getInstance();
        Flyweight flyweight1 = factory.getFlyweight(1);
        Flyweight flyweight2 = factory.getFlyweight(2);
        Flyweight flyweight3 = factory.getFlyweight(1);

        System.out.println("flyweight1: " + System.identityHashCode(flyweight1));
        System.out.println("flyweight2: " + System.identityHashCode(flyweight2));
        System.out.println("flyweight3: " + System.identityHashCode(flyweight3));
    }
}