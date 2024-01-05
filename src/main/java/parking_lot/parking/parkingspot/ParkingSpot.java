package parking_lot.parking.parkingspot;

import parking_lot.gate.EntranceGate;
import parking_lot.helpers.CoordinateHelper;
import parking_lot.parking.parkingspottypestrategy.IParkingSpotTypeStrategy;
import parking_lot.parking.parkingstrategy.IParkingStartegy;
import parking_lot.vehicles.Vehicle;

import java.util.UUID;



public class ParkingSpot {
    private final String parkingSpotId;
    private final CoordinateHelper coordinate;
    private final boolean isEmpty;
    private final Vehicle vehicle;
    private IParkingSpotTypeStrategy parkingSpotTypeStrategy;
    private final DistanceFromEntrance distanceFromEntrance;
    private final EntranceGate entranceGate;

    public ParkingSpot(int index, CoordinateHelper coordinate, EntranceGate entranceGate, IParkingSpotTypeStrategy parkingSpotTypeStrategy ){
        this.entranceGate=entranceGate;
        this.coordinate=coordinate;
        double entranceRow=entranceGate.getCoordinateHelper().getRow();
        double entranceCol=entranceGate.getCoordinateHelper().getCol();

        double parkingSpaceRow=coordinate.getRow();
        double parkingSpaceCol=coordinate.getCol();

        //finding euclidean distance
        double distanceSquared=Math.pow((parkingSpaceRow-entranceRow),2)+Math.pow((parkingSpaceCol-entranceCol),2);
        double euclidDistance=Math.sqrt(distanceSquared);
        this.distanceFromEntrance=new DistanceFromEntrance(index,euclidDistance);

        this.parkingSpotId=UUID.randomUUID().toString();
        this.isEmpty=true;
        this.vehicle=null;

    }

    void parkVehicle(Vehicle vehicle){
        //
    }

    void removeVehicle(Vehicle vehicle){
        //
    }

    public String getParkingSpotId() {
        return parkingSpotId;
    }

    public CoordinateHelper getCoordinate() {
        return coordinate;
    }

    public boolean isEmpty() {
        return isEmpty;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }

    public IParkingSpotTypeStrategy getParkingSpotTypeStrategy() {
        return parkingSpotTypeStrategy;
    }

    public DistanceFromEntrance getDistanceFromEntrance() {
        return distanceFromEntrance;
    }

    public EntranceGate getEntranceGate() {
        return entranceGate;
    }
}
