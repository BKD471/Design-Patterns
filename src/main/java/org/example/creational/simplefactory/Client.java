package org.example.creational.simplefactory;

import org.example.creational.simplefactory.simplefactory.VehicleFactory;

public class Client {
    public static void main(String[] args) {
        Vehicle vehicle=VehicleFactory.getVehicle("FIGHTER");
        System.out.println(vehicle);

        Vehicle vehicle1=VehicleFactory.getVehicle("CAR");
        System.out.println(vehicle1);
    }
}
