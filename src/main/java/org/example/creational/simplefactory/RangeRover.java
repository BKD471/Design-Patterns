package org.example.creational.simplefactory;

import org.example.creational.simplefactory.engines.Engine;
import org.example.creational.simplefactory.enums.FuelType;
import org.example.creational.simplefactory.enums.TransmissionType;

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
