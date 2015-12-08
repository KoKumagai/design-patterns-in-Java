package behavioral.mediator;

public class Colleague {
    private String name;
    private Mediator mediator;

    public Colleague(String name) {
        this.name  = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void sendMessage(Colleague to, String message) {
        mediator.consultation(this, to, message);
    }

    public void readMessage(String message) {
        System.out.println("Msg: " + message);
    }

    public void setMediator(Mediator mediator) {
        this.mediator = mediator;
    }
}