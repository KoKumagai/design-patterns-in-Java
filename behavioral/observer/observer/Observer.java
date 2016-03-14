package behavioral.observer.observer;

import behavioral.observer.subject.Subject;

public abstract class Observer {

    protected Subject subject;

    public abstract void update();

}