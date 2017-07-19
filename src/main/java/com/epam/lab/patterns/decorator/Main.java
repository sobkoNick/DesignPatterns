package com.epam.lab.patterns.decorator;

import org.apache.log4j.Logger;

/**
 * Decorator pattern allows a user to add new functionality
 * to an existing object without altering its structure.
 * This type of design pattern comes under structural pattern
 * as this pattern acts as a wrapper to existing class.
 * This pattern creates a decorator class which wraps the original class
 * and provides additional functionality keeping class methods signature intact.
 *
 * Decorator (декоратор, оформитель)
 * Как понятно из названия, данный паттерн чаще всего используется
 * для расширения исходного объекта до требуемого вида.
 * Например мы условно можем считать «декоратором» человека с кистью и красной краской.
 * Таким образом, какой бы объект (или определенный тип объектов) мы не передали в руки «декоратору»,
 * на выходе мы будем получать красные объекты.
 */
public class Main {
    public static final Logger LOG = Logger.getLogger(Main.class);

    public static void main(String[] args) {
        Droid droid = new BattleDroid();
        Droid droideka = new ShieldDroidDecorator(new Droideka());
        Droid battleDroid = new ShieldDroidDecorator(new BattleDroid());

        LOG.info(droid.move());
        LOG.info(droideka.move());
        LOG.info(battleDroid.move());
    }
}
