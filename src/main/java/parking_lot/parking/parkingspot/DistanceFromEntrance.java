package parking_lot.parking.parkingspot;

public class DistanceFromEntrance {
    private final double index;
    private final double distance;

    DistanceFromEntrance(double index,double distance){
        this.index=index;
        this.distance=distance;
    }

    public double getIndex() {
        return index;
    }

    public double getDistance() {
        return distance;
    }
}
