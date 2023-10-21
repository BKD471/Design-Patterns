package org.example.creational.prototype;

public class Client {
    public static void main(String[] args) throws Exception {
        System.out.println("########################## Shallow Cloning #################################");
        GarageShallowCloning garage=new GarageShallowCloning("Star Garage of Babu Ra0");
        garage.loadAllCars();

        System.out.println("All cars been loaded");

        GarageShallowCloning clonedGarage1=garage.clone();
        GarageShallowCloning clonedGarage2=garage.clone();

        System.out.println(garage);
        System.out.println(clonedGarage1);
        System.out.println(clonedGarage2);

        System.out.println("After mutating one instance.......");
        clonedGarage1.addCars("Range Rover");
        System.out.println(garage);
        System.out.println(clonedGarage1);
        System.out.println(clonedGarage2);

        System.out.println("############################### Deep Cloning ######################################");
        GarageDeepCloning loadedInstance=new GarageDeepCloning("Start Garage of Babu Rao");
        loadedInstance.loadAllCars();

        System.out.println("All cars been loaded");


        GarageDeepCloning clonedInstance1=loadedInstance.clone();
        GarageDeepCloning clonedInstance2=loadedInstance.clone();

        System.out.println(loadedInstance);
        System.out.println(clonedInstance1);
        System.out.println(clonedInstance2);

        clonedInstance1.addCars("Porche");
        System.out.println("After mutating one instance..............");
        System.out.println(loadedInstance);
        System.out.println(clonedInstance1);
        System.out.println(clonedInstance2);
    }
}
