package org.example.creational.simplefactory;

import org.example.creational.simplefactory.engines.Engine;
import org.example.creational.simplefactory.enums.FuelType;

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
