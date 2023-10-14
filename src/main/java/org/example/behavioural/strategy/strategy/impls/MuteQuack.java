package org.example.behavioural.strategy.strategy.impls;

import org.example.behavioural.strategy.strategy.IQuack;

public class MuteQuack implements IQuack {
    /**
     *
     */
    @Override
    public void quack() {
        System.out.println("I cannot quack");
    }
}
