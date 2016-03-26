package structural.proxy;

import structural.proxy.proxy.MailProxy;
import structural.proxy.subject.Mail;

public class Client {

    public static void main(String[] args) {
        Mail mail = new MailProxy();
        mail.send("Hello!!");
        // Sending...
        // Message: Hello!!
    }

}