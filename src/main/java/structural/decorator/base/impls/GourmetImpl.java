package structural.decorator.base.impls;

import structural.decorator.base.BasePizza;

public class GourmetImpl extends BasePizza {
    /**
     * @return
     */
    @Override
    public double cost() {
        return 300;
    }
}
