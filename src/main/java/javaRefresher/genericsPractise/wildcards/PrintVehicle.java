package javaRefresher.genericsPractise.wildcards;

import java.util.List;

public class PrintVehicle {
    //upper bound wildcard
    //vehicle and ist child classes are allowed
    public void setPrintValuesUpperBound(List<? extends  Vehicle> vehicleList){

    }

    //lower bound wildcard
    //vehcile and its super class
    public void setPrintValuesLowerBound(List<? super  Vehicle> vehicleList){

    }
}
