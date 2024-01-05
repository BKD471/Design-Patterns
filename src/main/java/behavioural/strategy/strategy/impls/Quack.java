package behavioural.strategy.strategy.impls;

import behavioural.strategy.strategy.IQuack;

public class Quack implements IQuack {
    /**
     *
     */
    @Override
    public void quack() {
        System.out.println("I quack quack.");
    }
}
