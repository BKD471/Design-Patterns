package creational.prototype;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class GarageShallowCloning implements Cloneable {
    private final String garageName;
    private  List<String> cars;
    public GarageShallowCloning(String name){
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
    protected GarageShallowCloning clone() throws CloneNotSupportedException {
        return  (GarageShallowCloning) super.clone();
    }

    @Override
    public String toString() {
        return "Garage{" +
                "garageName='" + garageName + '\'' +
                ", cars=" + cars +
                '}';
    }
}
