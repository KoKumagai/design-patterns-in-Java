package behavioral.chainOfResponsibility.Logger;

public abstract class Logger {

    public static int ERROR = 1;
    public static int INFO = 2;
    public static int DEBUG = 3;

    protected int level;
    protected Logger nextLogger;

    public Logger setNextLogger(Logger nextLogger) {
        this.nextLogger = nextLogger;
        return this;
    }

    public void logMessage(int level, String message) {
        if (level <= this.level) {
            write(message);
        }

        if (nextLogger != null) {
            nextLogger.logMessage(level, message);
        }
    }

    abstract protected void write(String message);

}