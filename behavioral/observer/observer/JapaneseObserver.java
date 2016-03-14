package behavioral.observer.observer;

import behavioral.observer.subject.Subject;

public class JapaneseObserver extends Observer {

    public JapaneseObserver(Subject subject) {
        this.subject = subject;
        this.subject.add(this);
    }

    @Override
    public void update() {
        System.out.println("Japanese: " + parseState());
    }

    private String parseState() {
        switch (this.subject.getState()) {
            case 1:
                return "一";
            case 2:
                return "二";
            case 3:
                return "三";
            case 4:
                return "四";
            case 5:
                return "五";
            case 6:
                return "六";
            case 7:
                return "七";
            case 8:
                return "八";
            case 9:
                return "九";
            default:
                return null;
        }
    }

}