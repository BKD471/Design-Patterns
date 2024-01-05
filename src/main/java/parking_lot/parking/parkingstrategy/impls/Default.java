package parking_lot.parking.parkingstrategy.impls;

import parking_lot.parking.parkingstrategy.IParkingStartegy;

public class Default implements IParkingStartegy {
    /**
     *
     */
    @Override
    public void park() {
        System.out.println("Your vehicle has been parked using NearToEntrance algorithm");
    }
}
