package com.epam.lab.patterns.chainOfResponsibility_Additional;

/**
 * Create an abstract logger class.
 */
public abstract class AbstractLogger {
    public static int INFO = 1;
    public static int WARN = 2;
    public static int ERROR = 3;

    protected int level;

    //next element in chain of responsibility
    protected AbstractLogger nextLogger;

    public void setNextLogger(AbstractLogger nextLogger) {
        this.nextLogger = nextLogger;
    }

    public void showMessage(int level, String message) {
        if (this.level <= level) {
            write(message);
        }
        if (nextLogger != null) {
            nextLogger.showMessage(level, message);
        }
    }

    abstract protected void write(String message);
}
