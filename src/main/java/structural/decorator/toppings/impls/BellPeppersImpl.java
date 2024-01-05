package structural.decorator.toppings.impls;

import structural.decorator.base.BasePizza;
import structural.decorator.toppings.ToppingsDecorator;

public class BellPeppersImpl extends ToppingsDecorator {
    private final BasePizza basePizza;

    public BellPeppersImpl(BasePizza basePizza){
        this.basePizza=basePizza;
    }

    /**
     * @return
     */
    @Override
    public double cost() {
        return this.basePizza.cost()+200;
    }
}
