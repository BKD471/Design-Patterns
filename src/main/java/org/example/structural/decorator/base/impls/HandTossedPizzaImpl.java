package org.example.structural.decorator.base.impls;

import org.example.structural.decorator.base.BasePizza;

public class HandTossedPizzaImpl extends BasePizza {

    /**
     * @return
     */
    @Override
    public double cost() {
        return 1000;
    }
}
