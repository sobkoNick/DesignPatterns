package com.epam.lab.patterns.decorator;

/**
 * Created by Mykola on 19.07.2017.
 */
public abstract class DroidDecorator implements Droid {
    protected Droid decoratedDroid;

    public DroidDecorator(Droid decoratedDroid) {
        this.decoratedDroid = decoratedDroid;
    }

    public String move() {
       return decoratedDroid.move();
    }
}
