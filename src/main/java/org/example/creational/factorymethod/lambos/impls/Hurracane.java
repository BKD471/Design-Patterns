package org.example.creational.factorymethod.lambos.impls;

import org.example.creational.factorymethod.enums.SeatType;
import org.example.creational.factorymethod.enums.TransmissionType;
import org.example.creational.factorymethod.lambos.Lamborghini;

public class Hurracane extends Lamborghini {
    private final SeatType seatType;
    private final TransmissionType transmissionType;
    public Hurracane(String modelName, double horsePower, SeatType seatType,
                     TransmissionType transmissionType){
        super(modelName,horsePower);
        this.seatType=seatType;
        this.transmissionType=transmissionType;
    }

    @Override
    public String toString() {
        return "Hurracane{" +
                "seatType=" + seatType +
                ", transmissionType=" + transmissionType +
                "} " + super.toString();
    }
}
