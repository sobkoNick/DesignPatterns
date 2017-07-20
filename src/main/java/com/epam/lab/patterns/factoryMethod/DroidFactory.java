package com.epam.lab.patterns.factoryMethod;

/**
 *
 */
public class DroidFactory {
    public Droid getDroid(String type) {
        if (type == null) {
            return null;
        }
        if (type.equalsIgnoreCase("b1")) {
            return new B1Droid();
        } else if (type.equalsIgnoreCase("b2")) {
            return new B2Droid();
        } else if (type.equalsIgnoreCase("droideka")) {
            return new Droideka();
        }
        return null;
    }
}
