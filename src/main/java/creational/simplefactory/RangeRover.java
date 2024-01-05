package creational.simplefactory;

import creational.simplefactory.engines.Engine;
import creational.simplefactory.enums.FuelType;
import creational.simplefactory.enums.TransmissionType;

public class RangeRover extends Vehicle{
    private final TransmissionType transmissionType;
    private final String wheelBase;
    public RangeRover(String modelName, Engine engine, TransmissionType transmissionType, String wheelBase) {
        super(modelName, engine);
        this.transmissionType=transmissionType;
        this.wheelBase=wheelBase;
    }

    @Override
    public String toString() {
        return "RangeRover{" +
                "transmissionType=" + transmissionType +
                ", wheelBase='" + wheelBase + '\'' +
                "} " + super.toString();
    }
}
