package com.epam.lab.patterns;

/**
 * Created by Mykola on 18.07.2017.
 */
public class FactoryProducer {
    public static DroidAbstractFactory getFactory(String choice) {
        if (choice.equalsIgnoreCase("BATTLE")) {
            return new BattleDroidFactory();
        } else if (choice.equalsIgnoreCase("FIX")) {
            return new FixDroidFactory();
        }
        // https://www.tutorialspoint.com/design_pattern/abstract_factory_pattern.htm next step is 8
        return null;
    }
}
