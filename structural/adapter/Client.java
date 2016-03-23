package structural.adapter;

import structural.adapter.adapter.NewSystem;

public class Client {

    public static void main(String[] args) {
        NewSystem newSystem = new NewSystem();
        newSystem.execute();
        // This is a new system.
        // This is a legacy system.
    }

}