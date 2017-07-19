package com.epam.lab.patterns.prototype;

/**
 *
 */
public class BB8Droid extends Droid {
    public BB8Droid() {
        droidType = "BB-8 Fix Droid";
    }

    String act() {
        return "I am bb8. I can roll and fix!";
    }
}
