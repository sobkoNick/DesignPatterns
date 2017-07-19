package com.epam.lab.patterns.chainOfResponsibility_Additional;

import org.apache.log4j.Logger;

/**
 *
 */
public class ErrorLogger extends AbstractLogger {
    private static final Logger LOG = Logger.getLogger(ErrorLogger.class);

    public ErrorLogger(int level) {
        this.level = level;
    }

    protected void write(String message) {
        LOG.error(message);
    }
}
