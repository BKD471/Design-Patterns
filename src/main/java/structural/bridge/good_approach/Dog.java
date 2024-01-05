package structural.bridge.good_approach;

import structural.bridge.good_approach.bridgeContext.LivingThingsContext;
import structural.bridge.good_approach.bridgeImpl.BreatheImplementor;

public class Dog extends LivingThingsContext {
    private final BreatheImplementor breatheImplementor;
    Dog(BreatheImplementor breatheImplementor){
        super(breatheImplementor);
        this.breatheImplementor=breatheImplementor;
    }
    /**
     *
     */
    @Override
    public void breatheInProcess() {
        breatheImplementor.breathe();
    }
}
