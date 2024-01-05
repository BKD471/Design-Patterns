package parking_lot.parking.parkingmanager.impls;

import parking_lot.parking.parkingmanager.ParkingSpotManager;
import parking_lot.parking.parkingspot.ParkingSpot;
import parking_lot.parking.parkingstrategy.IParkingStartegy;

import java.util.PriorityQueue;

public class HandiCapped extends ParkingSpotManager {
    public HandiCapped(IParkingStartegy parkingStartegy, PriorityQueue<ParkingSpot> lisOfParkingSpot) {
        super(parkingStartegy, lisOfParkingSpot);
    }
}
