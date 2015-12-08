package behavioral.mediator;

public class Client {
    public static void main(String[] args) {
        Mediator mediator = new Mediator();

        Colleague tom = new Colleague("Tom");
        Colleague emily = new Colleague("Emily");

        mediator.createColleagues(emily);

        tom.setMediator(mediator);
        tom.sendMessage(emily, "Hello!");
    }
}