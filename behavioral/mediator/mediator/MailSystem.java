package behavioral.mediator.mediator;

import behavioral.mediator.colleague.User;

public class MailSystem {

    public static void printMessage(User from, User to, String message) {
        System.out.println("From: " +  from.getName());
        System.out.println("To: " + to.getName());
        System.out.println("Message: " + message);
    }

}