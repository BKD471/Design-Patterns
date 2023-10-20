package org.example.creational.simplefactory.engines;

import org.example.creational.simplefactory.enums.FuelType;
import org.example.creational.simplefactory.enums.SeatType;

public abstract class Engine {
    private final String modelName;
    private final FuelType fuelType;
    private final SeatType seatType;

    Engine(String modelName,FuelType fuelType,SeatType seatType){
        this.modelName=modelName;
        this.fuelType=fuelType;
        this.seatType=seatType;
    }

    @Override
    public String toString() {
        return "Engine{" +
                "modelName='" + modelName + '\'' +
                ", fuelType=" + fuelType +
                ", seatType=" + seatType +
                '}';
    }
}
