package behavioral.chainOfResponsibility.Logger;

public class StderrLogger extends Logger {

    public StderrLogger(int level) {
        this.level = level;
    }

    @Override
    protected void write(String message) {
        System.out.println("Stderr: " + message);
    }

}