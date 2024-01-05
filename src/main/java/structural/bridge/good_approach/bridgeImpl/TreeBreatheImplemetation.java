package structural.bridge.good_approach.bridgeImpl;

public class TreeBreatheImplemetation implements BreatheImplementor{
    /**
     *
     */
    @Override
    public void breathe() {
        System.out.println(" ############ BREATHING PROCESS STARTED #############");
        System.out.println(" Breathe through Leafs ");
        System.out.println(" Inhale Co2");
        System.out.println("Exhale O2");
        System.out.println(" ############ BREATHING PROCESS ENDED #############");
    }
}
