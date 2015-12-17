package behavioral.observer;

public class UpperCaseObserver extends Observer {
    public UpperCaseObserver(Subject subject) {
        this.subject = subject;
        this.subject.attach(this);
    }

    @Override
    public void update() {
        System.out.println(subject.getState().toUpperCase());
    }
}