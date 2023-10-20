package org.example.creational.simplefactory.engines;

import org.example.creational.simplefactory.engines.Engine;
import org.example.creational.simplefactory.enums.EngineType;
import org.example.creational.simplefactory.enums.FuelType;
import org.example.creational.simplefactory.enums.SeatType;

public class JetEngine extends Engine {
    private final double thrust;
    private final EngineType engineType;
    public JetEngine(String modelName, FuelType fuelType, SeatType seatType,
                     double thrust, EngineType engineType) {
        super(modelName, fuelType,seatType);
        this.thrust=thrust;
        this.engineType=engineType;
    }

    @Override
    public String toString() {
        return "JetEngine{" +
                "thrust=" + thrust +
                ", engineType=" + engineType +
                "} " + super.toString();
    }
}
