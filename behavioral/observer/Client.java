package behavioral.observer;

import behavioral.observer.observer.HangulObserver;
import behavioral.observer.observer.JapaneseObserver;
import behavioral.observer.subject.Subject;

public class Client {

    public static void main(String[] args) {
        Subject subject = new Subject();

        new JapaneseObserver(subject);
        new HangulObserver(subject);

        subject.setState(3);
        // Japanese: 三
        // Hangul: 삼

        subject.setState(8);
        // Japanese: 八
        // Hangul: 팔
    }

}