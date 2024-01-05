package creational.simplefactory.engines;

import creational.simplefactory.engines.Engine;
import creational.simplefactory.enums.EngineType;
import creational.simplefactory.enums.FuelType;
import creational.simplefactory.enums.SeatType;

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
