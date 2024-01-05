package creational.builder1;

import creational.builder1.parts.Dimensions;
import creational.builder1.parts.Engine;
import creational.builder1.parts.EngineDimensions;
import creational.builder1.parts.FuelType;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Client {
    public static void main(String[] args) {
        EngineDimensions engineDimensions=new EngineDimensions.Builder()
                .length(190)
                .height(278)
                .breadth(765)
                .build();

        int[] temp={1,12,4,9,2,11,6,7,3,10,5,9};
        Set<Integer> firingOrderSet=new HashSet<>();
        Arrays.stream(temp).forEach(firingOrderSet::add);

        Engine engine=new Engine.Builder()
                .modelName("V12")
                .minPowerToHeight(378)
                .dimensions(engineDimensions)
                .maxTorque(690)
                .firingOrder(firingOrderSet)
                .co2Emissions(390)
                .combineFuelConsumption(17.2)
                .engineDisplacement(6890)
                .build();

        Dimensions dimensions=new Dimensions.Builder()
                .length(4843)
                .width(2273)
                .height(1136)
                .wheelBase(2700)
                .kerbWeight(1625)
                .build();

        Lamborghini lamborghini=new Lamborghini.Builder()
                .engine(engine)
                .modelName("Aventador")
                .dimensions(dimensions)
                .fuelType(FuelType.PETROL)
                .fuelTankCapacity(90.0)
                .groundClearanceUnladen(125.0)
                .seatingCapacity(2)
                .bootSpace(125.0)
                .antiLockBrakingSystem(true)
                .driverAirBag(true)
                .passengerAirBag(true)
                .build();
        System.out.println(lamborghini);
    }
}
