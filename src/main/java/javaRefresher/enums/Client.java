package javaRefresher.enums;

import java.util.Arrays;

public class Client {
    public static void main(String[] args) {
        /**
         * values
         * ordinal
         * valueOf
         * name
         * */
        for (EnumSample enumSample : EnumSample.values()) {
            System.out.println(enumSample.ordinal() + "--->" + enumSample.name());
        }

        EnumSample enumSample = EnumSample.valueOf("FRIDAY");
        System.out.println(enumSample.name());

        EnumSample enumSample1=EnumSample.getEnumByValue(102);
        System.out.println(enumSample1.getComment());


        EnumSample1 enumSample11=EnumSample1.FRIDAY;
        enumSample11.dummyMethod();

        EnumSample1 enumSample12=EnumSample1.MONDAY;
        enumSample12.dummyMethod();


        EnumSample3 enumSample3=EnumSample3.THURSDAY;
        System.out.println(enumSample3.toLowerCase());
    }
}
