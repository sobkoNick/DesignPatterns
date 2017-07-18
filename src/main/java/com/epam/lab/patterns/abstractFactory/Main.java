package com.epam.lab.patterns.abstractFactory;

import org.apache.log4j.Logger;

/**
 * Created by Mykola on 18.07.2017.
 */
public class Main {
    public static final Logger LOG = Logger.getLogger(Main.class);

    public static void main(String[] args) {
        LOG.info("main method started");

        DroidAbstractFactory battleDroidFactory = FactoryProducer.getFactory("battle");
        BattleDroid battleDroid = battleDroidFactory.getBattleDroid("Droideka");
        LOG.info(battleDroid.shoot());

        BattleDroid battleDroid2 = battleDroidFactory.getBattleDroid("B1Droid");
        LOG.info(battleDroid2.shoot());

        BattleDroid battleDroid3 = battleDroidFactory.getBattleDroid("SuperDroid");
        LOG.info(battleDroid3.shoot());

        DroidAbstractFactory fixDroidFactory = FactoryProducer.getFactory("fix");
        FixDroid fixDroid = fixDroidFactory.getFixDroid("MechanicDroid");
        LOG.info(fixDroid.fix());

        FixDroid fixDroid2 = fixDroidFactory.getFixDroid("EnergyDroid");
        LOG.info(fixDroid2.fix());
    }
}
