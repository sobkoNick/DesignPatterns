package com.epam.lab.patterns.adapter;

/**
 *
 */
public class BlusterGun implements AllInOneGun {
    public String shootBlusterGun(int numberTimes) {
        return "Shoot from bluster gun";
    }

    public String shootRocketGun(int numberTimes) {
        return null;
    }
}
