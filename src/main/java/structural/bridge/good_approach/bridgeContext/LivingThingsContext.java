package structural.bridge.good_approach.bridgeContext;

import structural.bridge.good_approach.bridgeImpl.BreatheImplementor;

public abstract class LivingThingsContext {
    private final BreatheImplementor breatheImplementor;

    protected LivingThingsContext(BreatheImplementor breatheImplementor){
        this.breatheImplementor=breatheImplementor;
    }

    protected abstract void breatheInProcess();
}
