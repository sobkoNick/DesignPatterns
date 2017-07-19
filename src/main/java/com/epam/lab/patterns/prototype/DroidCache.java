package com.epam.lab.patterns.prototype;

import java.util.HashMap;

/**
 *
 */
public class DroidCache {
    private static HashMap<String, Droid> droidHashMap = new HashMap<String, Droid>();

    public static Droid getDroid(String droidID) {
        Droid chachedDroid = droidHashMap.get(droidID);
        return (Droid) chachedDroid.clone();
    }

    public static void loadDroidCache() {
        EnergyDroid energyDroid = new EnergyDroid();
        energyDroid.setDroidID("1");
        droidHashMap.put(energyDroid.getDroidID(), energyDroid);

        BB8Droid bb8Droid = new BB8Droid();
        bb8Droid.setDroidID("2");
        droidHashMap.put(bb8Droid.getDroidID(), bb8Droid);

        R2D2 r2D2 = new R2D2();
        r2D2.setDroidID("3");
        droidHashMap.put(r2D2.getDroidID(), r2D2);

    }
}
