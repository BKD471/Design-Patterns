package org.example.creational.factorymethod.lambos.impls;

import org.example.creational.factorymethod.enums.SeatType;
import org.example.creational.factorymethod.enums.TransmissionType;
import org.example.creational.factorymethod.lambos.Lamborghini;

public class Urus extends Lamborghini {
    private final SeatType seatType;
    private final TransmissionType transmissionType;
    public Urus(String modelName, double horsePower, SeatType seatType,
                     TransmissionType transmissionType){
        super(modelName,horsePower);
        this.seatType=seatType;
        this.transmissionType=transmissionType;
    }

    @Override
    public String toString() {
        return "Urus{" +
                "seatType=" + seatType +
                ", transmissionType=" + transmissionType +
                "} " + super.toString();
    }
}
