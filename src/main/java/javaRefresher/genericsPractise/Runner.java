package javaRefresher.genericsPractise;

import java.util.ArrayList;
import java.util.List;

public class Runner {
    public static void main(String[] args) {
        List<Coordinates> listOfCoordinates=new ArrayList<>();
        listOfCoordinates.add(new Coordinates<>(47,678));
        listOfCoordinates.add(new Coordinates<>(4657.56d,67567.465d));
        listOfCoordinates.add(new Coordinates<>(1234,789));
        System.out.println(listOfCoordinates);
        Pair.doIt("Ferrari");
        Pair.doIts("fer",45);
        Pair.doIts(489,"egg5");
    }
}
