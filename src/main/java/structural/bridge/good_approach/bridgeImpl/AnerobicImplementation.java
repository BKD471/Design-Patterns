package structural.bridge.good_approach.bridgeImpl;

public class AnerobicImplementation implements BreatheImplementor{
    /**
     *
     */
    @Override
    public void breathe() {
        System.out.println(" ############ BREATHING PROCESS STARTED #############");
        System.out.println(" Breathe cells ");
        System.out.println(" Take Glucose");
        System.out.println("Exhale Ethanol, co2, water");
        System.out.println(" ############ BREATHING PROCESS ENDED #############");
    }
}
