package javaRefresher.genericsPractise.wildcards;

import java.util.List;
public class PrintList {
    //wildcard way
    public static void computeList(List<? extends Number> source,List<? extends Number> destination){

    }

    //generic way
    public static <T extends Number> void computeList1(List<T> source,List<T> destination){

    }
}
