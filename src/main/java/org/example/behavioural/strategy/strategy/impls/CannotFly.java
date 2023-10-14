package org.example.behavioural.strategy.strategy.impls;

import org.example.behavioural.strategy.strategy.IFly;

public class CannotFly implements IFly {
    /**
     *
     */
    @Override
    public void fly() {
        System.out.println("I cannot fly.");
    }
}
