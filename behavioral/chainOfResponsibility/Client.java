package behavioral.chainOfResponsibility;

import behavioral.chainOfResponsibility.Handler.FileLogger;
import behavioral.chainOfResponsibility.Handler.Logger;
import behavioral.chainOfResponsibility.Handler.StderrLogger;
import behavioral.chainOfResponsibility.Handler.StdoutLogger;

public class Client {

    public static void main(String[] args) {
        Logger logger = new StdoutLogger(Logger.DEBUG).setNextLogger(
                new FileLogger(Logger.INFO).setNextLogger(
                        new StderrLogger(Logger.ERROR)));

        logger.logMessage(Logger.DEBUG, "Debug level.");
        // Stdout: Debug level.

        logger.logMessage(Logger.INFO, "Info level.");
        // Stdout: Info level.
        // File: Info level.

        logger.logMessage(Logger.ERROR, "Error level.");
        // Stdout: Error level.
        // File: Error level.
        // Stderr: Error level.
    }

}