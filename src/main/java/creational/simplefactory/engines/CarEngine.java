package creational.simplefactory.engines;

import creational.simplefactory.enums.FuelType;
import creational.simplefactory.enums.SeatType;
import creational.simplefactory.enums.TransmissionType;

public class CarEngine extends Engine {
    private final int cylinders;
    private final double torque;
    private final double horsePower;
    private final TransmissionType transmissionType;
    public CarEngine(String modelName, FuelType fuelType, SeatType seatType,
              int cylinders, double torque,
              double horsePower, TransmissionType transmissionType) {
        super(modelName, fuelType,seatType);
        this.cylinders=cylinders;
        this.torque=torque;
        this.horsePower=horsePower;
        this.transmissionType=transmissionType;
    }

    @Override
    public String toString() {
        return "CarEngine{" +
                "cylinders=" + cylinders +
                ", torque=" + torque +
                ", horsePower=" + horsePower +
                ", transmissionType=" + transmissionType +
                "} " + super.toString();
    }
}
