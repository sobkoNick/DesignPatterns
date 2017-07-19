package com.epam.lab.patterns.prototype;

import org.apache.log4j.Logger;

/**
 * Prototype (прототип)

 Данный паттерн чем-то напоминает «фабрику», он также служит для создания объектов,
 однако с немного другим подходом. Представьте что у вас есть пустой пакет (из под сока),
 а вам нужен полный с апельсиновым соком. Вы «говорите» пакету «Хочу пакет апельсинового сока»,
 он в свою очередь создает свою копию и заполняет ее соком, который вы попросили.
 Немного «сказочный пример», но в программировании часто так и бывает.
 В данном случае пустой пакет и является «прототипом», и в зависимости от того что вам требуется,
 он создает на своей основе требуемые вами объекты (пакеты сока).

 Клонирование не обязательно должно производится на самом «пакете»,
 это может быть и какой-то другой «объект»,
 главное лишь что данный «прототип» позволяет получать его экземпляры
 *
 */
public class Main {
    public static final Logger LOG = Logger.getLogger(Main.class);

    public static void main(String[] args) {
        DroidCache.loadDroidCache();
        Droid clonedDroid = DroidCache.getDroid("1");
        LOG.info(String.format("Droid type: %s", clonedDroid.getDroidType()));
        Droid clonedDroid2 = DroidCache.getDroid("2");
        LOG.info(String.format("Droid type : %s", clonedDroid2.getDroidType()));
        Droid clonedDroid3 = DroidCache.getDroid("3");
        LOG.info(String.format("Droid type : %s", clonedDroid3.getDroidType()));
    }
}
