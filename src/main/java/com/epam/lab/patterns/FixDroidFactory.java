package com.epam.lab.patterns;

/**
 * Created by Mykola on 18.07.2017.
 */
public class FixDroidFactory extends DroidAbstractFactory {

    BattleDroid getBattleDroid(String droidType) {
        return null;
    }

    FixDroid getFixDroid(String droidType) {
        if (droidType == null) {
            return null;
        }
        if (droidType.equalsIgnoreCase("MechanicDroid")) {
            return new MechanicDroid();
        } else if (droidType.equalsIgnoreCase("EnergyDroid")) {
            return new EnergyDroid();
        }
        return null;
    }
}
