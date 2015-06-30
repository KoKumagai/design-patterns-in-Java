package factory.singleton;

import java.lang.System;

public class Client {
    public static void main(String[] args){        
        Singleton singleton1 = Singleton.getInstance();
        Singleton singleton2 = Singleton.getInstance();
        Singleton singleton3 = Singleton.getInstance();
        
        System.out.println("singleton1: " + System.identityHashCode(singleton1));
        System.out.println("singleton2: " + System.identityHashCode(singleton2));
        System.out.println("singleton3: " + System.identityHashCode(singleton3));
    }
}
