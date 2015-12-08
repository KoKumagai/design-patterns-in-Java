package behavioral.mediator;

import java.util.HashMap;

public class Mediator {
    private HashMap<String, Colleague> colleagues = new HashMap<String, Colleague>();

    public void createColleagues(Colleague colleague) {
        colleagues.put(colleague.getName(), colleague);
    }

    public void consultation(Colleague from, Colleague to, String message) {
        System.out.println("From: " + from.getName());
        System.out.println("To: " + to.getName());
        colleagues.get(to.getName()).readMessage(message);
    }
}