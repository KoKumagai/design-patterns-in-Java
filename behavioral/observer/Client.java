package behavioral.observer;

public class Client {
    public static void main(String[] args) {
        Subject subject = new Subject();

        new UpperCaseObserver(subject);
        new LowerCaseObserver(subject);

        subject.setState("aAbBcC");
        subject.setState("XxYyZz");
    }
}