package com.epam.lab.patterns;

/**
 * Created by Mykola on 18.07.2017.
 */
public abstract class DroidAbstractFactory {
    abstract BattleDroid getBattleDroid(String droidType);
    abstract FixDroid getFixDroid(String droidType);
}
