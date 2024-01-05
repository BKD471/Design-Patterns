package javaRefresher.annotations.defiined.javabased.safeVararg;

import java.util.ArrayList;
import java.util.List;

public class Log {
    @SafeVarargs
    public static void printLogValues(List<Integer>... logNumbersList ){
        Object[] objectList=logNumbersList;

        List<String> stringValuesList=new ArrayList<>();
        stringValuesList.add("Hello");
        objectList[0]=stringValuesList;
        /*
        * objectList is supposed to store list of Integers
        * but its also storing list of String at index 0
        * itss a heap pollution to supress use annotaion
        * */
    }
}
