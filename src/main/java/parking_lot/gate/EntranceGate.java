package parking_lot.gate;

import parking_lot.helpers.CoordinateHelper;

public class EntranceGate {
    private final CoordinateHelper coordinateHelper;

    EntranceGate(){
        //this is cordinate of entrance
        this.coordinateHelper=new CoordinateHelper(15,10);
    }

    public CoordinateHelper getCoordinateHelper() {
        return coordinateHelper;
    }
}
