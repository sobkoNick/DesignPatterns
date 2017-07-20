package com.epam.lab.patterns.adapter;

/**
 *
 */
public class RocketGun implements AllInOneGun {
    public String shootBlusterGun(int numberTimes) {
        return null;
    }

    public String shootRocketGun(int numberTimes) {
        return "Shoot from rocketGun. Damage 2x";
    }
}
