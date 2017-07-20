package com.epam.lab.patterns.adapter;

/**
 *
 */
public class GunAdapter implements Weapon {

    AllInOneGun allInOneGun;

    public GunAdapter(String gunType) {
        if (gunType.equalsIgnoreCase("bluster"))
            allInOneGun = new BlusterGun();
        if (gunType.equalsIgnoreCase("rocket"))
            allInOneGun = new RocketGun();
    }

    public String shoot(int numberTimes, String gunType) {
        if (gunType.equalsIgnoreCase("bluster")) {
            return allInOneGun.shootBlusterGun(numberTimes);
        }
        else if (gunType.equalsIgnoreCase("rocket")) {
            return allInOneGun.shootRocketGun(numberTimes);
        }
           return null;
    }
}
