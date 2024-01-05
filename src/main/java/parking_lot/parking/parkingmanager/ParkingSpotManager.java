package parking_lot.parking.parkingmanager;

import parking_lot.parking.parkingspot.DistanceFromEntrance;
import parking_lot.parking.parkingspot.ParkingSpot;
import parking_lot.parking.parkingstrategy.IParkingStartegy;

import java.util.Collection;
import java.util.Comparator;
import java.util.PriorityQueue;

public class ParkingSpotManager {
    Comparator<ParkingSpot> sortByNearestToEntrance=(a, b)->a.getDistanceFromEntrance().getDistance()
            <b.getDistanceFromEntrance().getDistance()?-1
            :a.getDistanceFromEntrance().getDistance()>b.getDistanceFromEntrance().getDistance()?1:
            0;
    private PriorityQueue<ParkingSpot> lisOfParkingSpot=
            new PriorityQueue<ParkingSpot>( sortByNearestToEntrance);
    private final IParkingStartegy parkingStartegy;

    public ParkingSpotManager(IParkingStartegy parkingStartegy,PriorityQueue<ParkingSpot> lisOfParkingSpot){
        this.lisOfParkingSpot=lisOfParkingSpot;
        this.parkingStartegy=parkingStartegy;
    }
}
