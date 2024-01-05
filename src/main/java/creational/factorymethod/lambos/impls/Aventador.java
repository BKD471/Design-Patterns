package creational.factorymethod.lambos.impls;

import creational.factorymethod.enums.SeatType;
import creational.factorymethod.enums.TransmissionType;
import creational.factorymethod.lambofactory.impl.AventadorCreator;
import creational.factorymethod.lambos.Lamborghini;

import java.util.Set;

public class Aventador extends Lamborghini {
    private final SeatType seatType;
    private final TransmissionType transmissionType;
    public Aventador(String modelName, double horsePower, SeatType seatType,
                     TransmissionType transmissionType){
        super(modelName,horsePower);
        this.seatType=seatType;
        this.transmissionType=transmissionType;
    }

    @Override
    public String toString() {
        return "Aventador{" +
                "seatType=" + seatType +
                ", transmissionType=" + transmissionType +
                "} " + super.toString();
    }
}
