package com.epam.lab.patterns.chainOfResponsibility_Additional;

import org.apache.log4j.Logger;

/**
 *
 */
public class WarnLogger extends AbstractLogger {
    private static final Logger LOG = Logger.getLogger(WarnLogger.class);

    public WarnLogger(int level) {
        this.level = level;
    }

    protected void write(String message) {
        LOG.warn(message);
    }
}
