package com.epam.lab.patterns.factoryMethod;

import org.apache.log4j.Logger;

/**
 *
 * Factory pattern is one of the most used design patterns in Java.
 * This type of design pattern comes under creational pattern as this pattern
 * provides one of the best ways to create an object.
 *
 * In Factory pattern, we create object without exposing the creation logic
 * to the client and refer to newly created object using a common interface.
 */
public class Main {
    public static final Logger LOG = Logger.getLogger(Main.class);

    public static void main(String[] args) {
        DroidFactory droidFactory = new DroidFactory();
        Droid droid1 = droidFactory.getDroid("b1");
        LOG.info(droid1.attack());
        Droid droid2 = droidFactory.getDroid("b2");
        LOG.info(droid2.attack());
        Droid droid3 = droidFactory.getDroid("droideka");
        LOG.info(droid3.attack());

        Droid droid4 = droidFactory.getDroid("nullableDroid");
        try {
            LOG.info(droid4.attack());
        } catch (NullPointerException e) {
            LOG.warn(e);
        }
    }
}
