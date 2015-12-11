package behavioral.observer;

public class LowerCaseObserver extends Observer {
    public LowerCaseObserver(Subject subject) {
        this.subject = subject;
        this.subject.attach(this);
    }

    public void update() {
        System.out.println(subject.getState().toLowerCase());
    }
}