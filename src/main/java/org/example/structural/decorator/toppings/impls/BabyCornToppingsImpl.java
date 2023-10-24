package org.example.structural.decorator.toppings.impls;

import org.example.structural.decorator.base.BasePizza;
import org.example.structural.decorator.toppings.ToppingsDecorator;

public class BabyCornToppingsImpl extends ToppingsDecorator {
    private final BasePizza basePizza;

    public BabyCornToppingsImpl(BasePizza basePizza){
        this.basePizza=basePizza;
    }

    /**
     * @return
     */
    @Override
    public double cost() {
        return this.basePizza.cost()+100;
    }
}
