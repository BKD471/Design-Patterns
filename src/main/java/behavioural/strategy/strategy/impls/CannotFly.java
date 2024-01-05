package behavioural.strategy.strategy.impls;

import behavioural.strategy.strategy.IFly;

public class CannotFly implements IFly {
    /**
     *
     */
    @Override
    public void fly() {
        System.out.println("I cannot fly.");
    }
}
