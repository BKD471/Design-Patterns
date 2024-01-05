package parking_lot.parking.parkingspottypestrategy.impls;

import parking_lot.parking.parkingspottypestrategy.IParkingSpotTypeStrategy;

public class HandiCappedVehicleSpotImpl implements IParkingSpotTypeStrategy {
    /**
     * @return
     */
    @Override
    public double getPriceForParkingSportType() {
        return 10;
    }
}
