package behavioural.strategy.strategy.impls;

import behavioural.strategy.strategy.IQuack;

public class MuteQuack implements IQuack {
    /**
     *
     */
    @Override
    public void quack() {
        System.out.println("I cannot quack");
    }
}
