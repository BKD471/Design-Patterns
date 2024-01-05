package javaRefresher.genericsPractise.wildcards;


import java.util.ArrayList;
import java.util.List;

public class Client {
    public static void main(String[] args) {
        List<Vehicle> vehicleList=new ArrayList<>();
        List<Ferrari> ferrariList=new ArrayList<>();

        Vehicle vehicle=new Vehicle();
        Ferrari ferrari=new Ferrari();

        vehicle=ferrari; //thus is possible

        //but
        //vehicleList=ferrariList // this is not

        vehicleList.add(new Vehicle());
        vehicleList.add(new Ferrari());

        PrintVehicle print=new PrintVehicle();
        print.setPrintValuesUpperBound(vehicleList);
        print.setPrintValuesUpperBound(ferrariList);

        print.setPrintValuesLowerBound(vehicleList);
        List<TataNano> tataNanosList=new ArrayList<>();
        print.setPrintValuesLowerBound(tataNanosList); //super of vehcile so allowed

        //but
        //print.setPrintValuesLowerBound(ferrariList);
        // np  need vehicle or super of vehicle


        List<Integer> myIntegerList=new ArrayList<>();
        List<Double> myDoubleList=new ArrayList<>();

        PrintList.computeList(myIntegerList,myDoubleList);//allowed
        //PrintList.computeList1(myIntegerList,myDoubleList);//NP both should have smae type

        //WILDCARD VS GENERIC

        //case 1:
        //if u have a case where all parms have one type then its best to go with generic
        //when u can have multiple types to accept then use wildcard

       //case 2:
        // u can have lower bound with wildcard but not with generics
    }
}
