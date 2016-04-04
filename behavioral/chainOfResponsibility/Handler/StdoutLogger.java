package behavioral.chainOfResponsibility.Handler;

public class StdoutLogger extends Logger {

    public StdoutLogger(int level) {
        this.level = level;
    }

    @Override
    protected void write(String message) {
        System.out.println("Stdout: " + message);
    }

}