package structural.bridge.good_approach.bridgeImpl;

public class LandBreatheImplementation implements BreatheImplementor{
    /**
     *
     */
    @Override
    public void breathe() {
        System.out.println(" ############ BREATHING PROCESS STARTED #############");
        System.out.println(" Breathe through Nose ");
        System.out.println(" Inhale Oxygen");
        System.out.println("Exhale Co2");
        System.out.println(" ############ BREATHING PROCESS ENDED #############");
    }
}
