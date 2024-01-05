package structural.bridge.good_approach;

import structural.bridge.good_approach.bridgeContext.LivingThingsContext;
import structural.bridge.good_approach.bridgeImpl.BreatheImplementor;

public class Fish extends LivingThingsContext {
    private final BreatheImplementor breatheImplementor;
    public Fish(BreatheImplementor breatheImplementor){
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
