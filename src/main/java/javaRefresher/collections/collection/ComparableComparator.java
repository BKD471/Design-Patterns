package javaRefresher.collections.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ComparableComparator {
    public static void main(String[] args) {
        List<Cars> carsList=new ArrayList<>();
        Cars cars=new Cars("Lamborghini Aventador",9_00_00_000,FuelType.PETROL);
        Cars cars1=new Cars("Aston Martin M1",5_00_00_000,FuelType.DIESEL);
        Cars cars2=new Cars("Lamborghini Revuelto",7_00_00_000,FuelType.DIESEL);
        Cars cars3=new Cars("Lamborghini Veneno",2_00_00_000,FuelType.DIESEL);
        Cars cars4=new Cars("La Ferrai",15_00_00_000,FuelType.HYBRID);
        carsList.add(cars);carsList.add(cars1);carsList.add(cars2);carsList.add(cars3);carsList.add(cars4);

        Collections.sort(carsList);
        System.out.println(carsList);

        //sorting in ascending of car name
        Comparator<Cars> c=(a,b)-> a.getCarName().compareTo(b.getCarName());
        Collections.sort(carsList,c);
        System.out.println(carsList);

        //by comparator we can sort in both ways
        //but by comparable sorting direction is only one that is given in the class
    }
}
