package org.example.structural.decorator.toppings.impls;

import org.example.structural.decorator.base.BasePizza;
import org.example.structural.decorator.toppings.ToppingsDecorator;

public class JalapenoToppingsImpl extends ToppingsDecorator {
    private final BasePizza basePizza;

    public JalapenoToppingsImpl(BasePizza basePizza){
        this.basePizza=basePizza;
    }

    /**
     * @return
     */
    @Override
    public double cost() {
        return this.basePizza.cost()+600;
    }
}
