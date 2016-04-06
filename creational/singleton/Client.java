package creational.singleton;

import creational.singleton.singleton.Singleton;

public class Client {

    public static void main(String[] args) {
        // Singleton singleton = new Singleton();
        Singleton singleton1 = Singleton.getInstance();
        Singleton singleton2 = Singleton.getInstance();
        Singleton singleton3 = Singleton.getInstance();

        System.out.println("singleton1: " + System.identityHashCode(singleton1)); // singleton1: 1360875712
        System.out.println("singleton2: " + System.identityHashCode(singleton2)); // singleton2: 1360875712
        System.out.println("singleton3: " + System.identityHashCode(singleton3)); // singleton3: 1360875712
    }

}