package behavioral.mediator.colleague;

import behavioral.mediator.mediator.MailSystem;

public class User {

    private String name;

    public User(String name) {
        this.name  = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void sendMessage(User to, String message) {
        MailSystem.printMessage(this, to, message);
    }

}