package structural.proxy.subject;

public class RealMail implements Mail {

    private String message;

    @Override
    public void send(String message) {
        System.out.println("Sending...");
        System.out.println("Message: " + message);
    }

}