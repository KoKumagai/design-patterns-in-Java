package behavioral.observer.observer;

import behavioral.observer.subject.Subject;

public class HangulObserver extends Observer {

    public HangulObserver(Subject subject) {
        this.subject = subject;
        this.subject.add(this);
    }

    @Override
    public void update() {
        System.out.println("Hangul: " + parseState());
    }

    private String parseState() {
        switch (this.subject.getState()) {
            case 1:
                return "일";
            case 2:
                return "이";
            case 3:
                return "삼";
            case 4:
                return "사";
            case 5:
                return "오";
            case 6:
                return "육";
            case 7:
                return "칠";
            case 8:
                return "팔";
            case 9:
                return "구";
            default:
                return null;
        }
    }

}