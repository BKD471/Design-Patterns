package creational.factorymethod.lambos.impls;

import creational.factorymethod.enums.SeatType;
import creational.factorymethod.enums.TransmissionType;
import creational.factorymethod.lambos.Lamborghini;

public class Revuelto extends Lamborghini {
    private final SeatType seatType;
    private final TransmissionType transmissionType;
    public Revuelto(String modelName, double horsePower, SeatType seatType,
                     TransmissionType transmissionType){
        super(modelName,horsePower);
        this.seatType=seatType;
        this.transmissionType=transmissionType;
    }

    @Override
    public String toString() {
        return "Revuelto{" +
                "seatType=" + seatType +
                ", transmissionType=" + transmissionType +
                "} " + super.toString();
    }
}
