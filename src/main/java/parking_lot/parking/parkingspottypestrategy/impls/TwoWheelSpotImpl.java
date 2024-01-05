package parking_lot.parking.parkingspottypestrategy.impls;

import parking_lot.parking.parkingspottypestrategy.IParkingSpotTypeStrategy;

public class TwoWheelSpotImpl  implements IParkingSpotTypeStrategy {
    /**
     * @return
     */
    @Override
    public double getPriceForParkingSportType() {
        return 100;
    }
}
