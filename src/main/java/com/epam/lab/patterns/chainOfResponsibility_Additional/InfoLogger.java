package com.epam.lab.patterns.chainOfResponsibility_Additional;

import org.apache.log4j.Logger;

/**
 *
 */
public class InfoLogger extends AbstractLogger {
    private static final Logger LOG = Logger.getLogger(InfoLogger.class);

    public InfoLogger(int level) {
        this.level = level;
    }

    protected void write(String message) {
        LOG.info(message);
    }
}
