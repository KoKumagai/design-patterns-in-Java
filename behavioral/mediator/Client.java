package behavioral.mediator;

import behavioral.mediator.colleague.User;

public class Client {

    public static void main(String[] args) {
        User ko = new User("Ko");
        User gosling = new User("Gosling");

        ko.sendMessage(gosling, "Hello! How are you?");
        // From: Ko
        // To: Gosling
        // Message: Hello! How are you?

        gosling.sendMessage(ko, "Good! Thank you.");
        // From: Gosling
        // To: Ko
        // Message: Good! Thank you.
    }

}