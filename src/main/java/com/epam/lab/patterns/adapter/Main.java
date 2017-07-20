package com.epam.lab.patterns.adapter;

import org.apache.log4j.Logger;

/**
 * Adapter pattern works as a bridge between two incompatible interfaces.
 * This type of design pattern comes under structural pattern as this pattern combines
 * the capability of two independent interfaces.
 * This pattern involves a single class which is responsible to join functionalities
 * of independent or incompatible interfaces. A real life example could be a case of card reader
 * which acts as an adapter between memory card and a laptop. You plugin the memory card into card reader
 * and card reader into the laptop so that memory card can be read via laptop.
 *
 *Adapter или wrapper (адаптер, обертка)
 Данный паттерн полностью соответствует своему названию. Чтобы заставить работать «советскую» вилку
 через евро-розетку требуется переходник. Именно это и делает «адаптер», служит промежуточным объектом
 между двумя другими, которые не могут работать напрямую друг с другом.
 */
public class Main {
    public static final Logger LOG = Logger.getLogger(Main.class);

    public static void main(String[] args) {
        SuperBattleDroid superBattleDroid = new SuperBattleDroid();

        LOG.info(superBattleDroid.shoot(5, "gun"));
        LOG.info(superBattleDroid.shoot(10, "rocket"));
        LOG.info(superBattleDroid.shoot(20, "bluster"));
        LOG.info(superBattleDroid.shoot(1, "bazuka"));

    }
}
