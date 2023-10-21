package org.example.creational.prototype;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class GarageDeepCloning implements Cloneable {
    private final String garageName;
    private  List<String> cars;
    public GarageDeepCloning(String name){
        garageName=name;
    }

    public void loadAllCars() throws  Exception{
        List<String> temp=new ArrayList<>(Arrays.asList("Lamborghini","Ferrari","Aston Martin","Mercedez"));
        Thread.sleep(5000);
        this.cars=temp;
    }

    public List<String> getCars(){
        return cars;
    }

    public void addCars(String car){
        this.cars.add(car);
    }

    /**
     * @return
     * @throws CloneNotSupportedException
     */
    @Override
    protected GarageDeepCloning clone() throws CloneNotSupportedException {
        GarageDeepCloning garageDeepCloning=(GarageDeepCloning) super.clone();
        garageDeepCloning.cars= new ArrayList<>(cars);
        return  garageDeepCloning;
    }

    @Override
    public String toString() {
        return "Garage{" +
                "garageName='" + garageName + '\'' +
                ", cars=" + cars +
                '}';
    }
}
