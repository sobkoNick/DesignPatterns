package com.epam.lab.patterns.decorator;

/**
 * Created by Mykola on 19.07.2017.
 */
public class ShieldDroidDecorator extends DroidDecorator {
    public ShieldDroidDecorator(Droid decoratedDroid) {
        super(decoratedDroid);
    }

    @Override
    public String move() {
        return String.format("%s %s", super.move(), setShieldForDroid(decoratedDroid));
    }

    private String setShieldForDroid(Droid decoratedDroid) {
        return "Droid uses shield!";
    }
}
