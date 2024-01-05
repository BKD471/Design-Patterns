package parking_lot.parking.parkingstrategy.impls;

import parking_lot.parking.parkingstrategy.IParkingStartegy;

public class NearToEntrance implements IParkingStartegy {
    /**
     *
     */
    @Override
    public void park() {
        System.out.println("Your vehicle has been parked near to entrance using NearToEntrance algorithm");
    }
}
