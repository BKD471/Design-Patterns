package creational.simplefactory.simplefactory;

import org.apache.commons.lang3.StringUtils;
import creational.simplefactory.F35LightningB;
import creational.simplefactory.RangeRover;
import creational.simplefactory.Vehicle;
import creational.simplefactory.engines.CarEngine;
import creational.simplefactory.engines.Engine;
import creational.simplefactory.engines.JetEngine;
import creational.simplefactory.enums.*;

public class VehicleFactory {
    public static Vehicle getVehicle(String type){
        if(StringUtils.isEmpty(type)) return null;

        Engine engine=getEngine(type);
        switch (type){
            case "FIGHTER": return new F35LightningB("b12",engine, WingType.SWEPT_BACK,
                    118,50000,8);
            case "CAR": return new RangeRover("classic",engine,TransmissionType.AUTOMATIC,"4X4");
            default:throw new RuntimeException("Wrong request type for Vehicle");
        }
    }

    private   static Engine getEngine(String type){
        if(StringUtils.isEmpty(type)) return  null;
        switch (type){
            case "FIGHTER":return  new JetEngine("TurboFan", FuelType.AVIATION_FUEL
                    , SeatType.TWIN,150, EngineType.TWIN_ENGINE);
            case "CAR": return new CarEngine("Classic",FuelType.PETROL,SeatType.FOUR,6,170,600, TransmissionType.AUTOMATIC);
            default:throw new RuntimeException("Wrong request type for Engine");
        }
    }
}
