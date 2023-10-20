package org.example.creational.simplefactory.simplefactory;

import org.apache.commons.lang3.StringUtils;
import org.example.creational.simplefactory.F35LightningB;
import org.example.creational.simplefactory.RangeRover;
import org.example.creational.simplefactory.Vehicle;
import org.example.creational.simplefactory.engines.CarEngine;
import org.example.creational.simplefactory.engines.Engine;
import org.example.creational.simplefactory.engines.JetEngine;
import org.example.creational.simplefactory.enums.*;

public class VehicleFactory {
    public static Vehicle getVehicle(String type){
        if(StringUtils.isEmpty(type)) return null;

        Engine engine=getEngine(type);
        switch (type){
            case "FIGHTER": return new F35LightningB("b12",engine, WingType.SWEPT_BACK,
                    118,50000,8);
            case "CAR": return new RangeRover("classic",engine,TransmissionType.AUTOMATIC,"4X4");
            default:return null;
        }
    }

    public  static Engine getEngine(String type){
        if(StringUtils.isEmpty(type)) return  null;
        switch (type){
            case "FIGHTER":return  new JetEngine("TurboFan", FuelType.AVIATION_FUEL
                    , SeatType.TWIN,150, EngineType.TWIN_ENGINE);
            case "CAR": return new CarEngine("Classic",FuelType.PETROL,SeatType.FOUR,6,170,600, TransmissionType.AUTOMATIC);
            default:return null;
        }
    }
}
