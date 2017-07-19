package com.epam.lab.patterns.abstractFactory;

import org.apache.log4j.Logger;

/**
 * Factory (фабрика)

 Суть паттерна практически полностью описывается его названием.
 Когда вам требуется получать какие-то объекты, например пакеты сока,
 вам совершенно не нужно знать как их делают на фабрике.
 Вы просто говорите «сделайте мне пакет апельсинового сока»,
 а «фабрика» возвращает вам требуемый пакет. Как? Всё это решает сама фабрика,
 например «копирует» уже существующий эталон. Основное предназначение «фабрики» в том,
 чтобы можно было при необходимости изменять процесс «появления» пакета сока,
 а самому потребителю ничего об этом не нужно было сообщать, чтобы он запрашивал его как и прежде.

 Как правило, одна фабрика занимается «производством» только одного рода «продуктов».
 Не рекомендуется «фабрику соков» создавать с учетом производства автомобильных покрышек.
 Как и в жизни, паттерн «фабрика» часто создается «одиночкой».
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
