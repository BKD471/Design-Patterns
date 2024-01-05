package structural.decorator.toppings.impls;

import structural.decorator.base.BasePizza;
import structural.decorator.toppings.ToppingsDecorator;

public class ExtraCheeseToppingsImpl extends ToppingsDecorator {
    private final BasePizza basePizza;

    public ExtraCheeseToppingsImpl(BasePizza basePizza){
        this.basePizza=basePizza;
    }

    /**
     * @return
     */
    @Override
    public double cost() {
        return this.basePizza.cost()+500;
    }
}
