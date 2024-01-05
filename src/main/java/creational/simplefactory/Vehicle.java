package creational.simplefactory;

import creational.simplefactory.engines.Engine;
import creational.simplefactory.enums.FuelType;

public abstract class Vehicle {
    private final String modelName;
    private final Engine engine;
    Vehicle(String modelName,Engine engine){
        this.modelName=modelName;
        this.engine=engine;
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "modelName='" + modelName + '\'' +
                ", engine=" + engine +
                '}';
    }
}
