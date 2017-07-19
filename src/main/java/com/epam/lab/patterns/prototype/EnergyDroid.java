package com.epam.lab.patterns.prototype;

/**
 *
 */
public class EnergyDroid extends Droid {
    public EnergyDroid() {
        droidType = "EnergyDroid";
    }

    String act() {
        return "I am EnergyDroid. I recharge other droids";
    }
}
