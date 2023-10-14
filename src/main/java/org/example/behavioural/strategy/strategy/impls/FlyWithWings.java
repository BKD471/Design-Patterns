package org.example.behavioural.strategy.strategy.impls;

import org.example.behavioural.strategy.strategy.IFly;

public class FlyWithWings implements IFly {
    /**
     *
     */
    @Override
    public void fly() {
        System.out.println("I fly with wings");
    }
}
