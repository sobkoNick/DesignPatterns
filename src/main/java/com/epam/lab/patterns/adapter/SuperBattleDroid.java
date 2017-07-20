package com.epam.lab.patterns.adapter;

/**
 *
 */
public class SuperBattleDroid implements Weapon {
    public String shoot(int numberTimes, String gunType) {
        GunAdapter gunAdapter;
        if (gunType.equalsIgnoreCase("gun")) {
            return String.format("Just shoot %d times", numberTimes);
        } else if (gunType.equalsIgnoreCase("bluster") || gunType.equalsIgnoreCase("rocket")) {
            gunAdapter = new GunAdapter(gunType);
            return gunAdapter.shoot(numberTimes, gunType);
        } else {
            return "No such gun to shoot";
        }
    }
}
