package behavioural.strategy.strategy.impls;

import behavioural.strategy.strategy.IFly;

public class FlyWithWings implements IFly {
    /**
     *
     */
    @Override
    public void fly() {
        System.out.println("I fly with wings");
    }
}
