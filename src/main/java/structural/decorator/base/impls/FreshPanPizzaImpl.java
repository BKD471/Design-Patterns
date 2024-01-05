package structural.decorator.base.impls;

import structural.decorator.base.BasePizza;

public class FreshPanPizzaImpl extends BasePizza {
    /**
     * @return
     */
    @Override
    public double cost() {
        return 500;
    }
}
