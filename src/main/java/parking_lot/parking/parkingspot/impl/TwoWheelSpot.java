package parking_lot.parking.parkingspot.impl;

import parking_lot.gate.EntranceGate;
import parking_lot.helpers.CoordinateHelper;
import parking_lot.parking.parkingspot.ParkingSpot;
import parking_lot.parking.parkingspottypestrategy.IParkingSpotTypeStrategy;

public class TwoWheelSpot extends ParkingSpot {
    public TwoWheelSpot(int index, CoordinateHelper coordinate, EntranceGate entranceGate, IParkingSpotTypeStrategy parkingSpotTypeStrategy) {
        super(index, coordinate, entranceGate, parkingSpotTypeStrategy);
    }

    double price(){
        return 100;
    }
}
