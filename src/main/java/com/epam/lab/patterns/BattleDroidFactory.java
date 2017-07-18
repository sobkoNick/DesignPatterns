package com.epam.lab.patterns;

/**
 * Created by Mykola on 18.07.2017.
 */
public class BattleDroidFactory extends DroidAbstractFactory {
    BattleDroid getBattleDroid(String droidType) {
        if (droidType == null) {
            return null;
        }
        if (droidType.equalsIgnoreCase("B1Droid")) {
            return new B1Droid();
        } else if (droidType.equalsIgnoreCase("SuperDroid")) {
            return new SuperDroid();
        } else if (droidType.equalsIgnoreCase("Droideka")) {
            return new Droideka();
        }
        return null;
    }

    FixDroid getFixDroid(String droidType) {
        return null;
    }
}
