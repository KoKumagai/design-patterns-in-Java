package structural.proxy.proxy;

import structural.proxy.subject.Mail;
import structural.proxy.subject.RealMail;

public class MailProxy implements Mail {

    private RealMail realMail;

    @Override
    public void send(String message) {
        if (realMail == null) {
            realMail = new RealMail();
        }
        realMail.send(message);
    }

}