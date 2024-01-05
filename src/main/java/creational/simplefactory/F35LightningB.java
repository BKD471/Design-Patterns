package creational.simplefactory;

import creational.simplefactory.engines.Engine;
import creational.simplefactory.enums.FuelType;
import creational.simplefactory.enums.WingType;

public class F35LightningB extends Vehicle{
    private final WingType wingType;
    private final double rateOfClimb;
    private final double serviceCeilings;
    private final int hardPoints;
    public F35LightningB(String modelName, Engine engine, WingType wingType,
                         double rateOfClimb, double serviceCeilings, int hardPoints) {
        super(modelName, engine);
        this.wingType=wingType;
        this.rateOfClimb=rateOfClimb;
        this.serviceCeilings=serviceCeilings;
        this.hardPoints=hardPoints;
    }

    @Override
    public String toString() {
        return "F35LightningB{" +
                "wingType=" + wingType +
                ", rateOfClimb=" + rateOfClimb +
                ", serviceCeilings=" + serviceCeilings +
                ", hardPoints=" + hardPoints +
                "} " + super.toString();
    }
}
