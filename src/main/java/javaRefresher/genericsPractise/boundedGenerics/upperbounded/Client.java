package javaRefresher.genericsPractise.boundedGenerics.upperbounded;

import java.math.BigDecimal;

public class Client {
    public static void main(String[] args) {
        IntegerPrinter<Integer> integerPrinter=new IntegerPrinter<>();
        integerPrinter.setValue(69);
        System.out.println(integerPrinter.getValue());

        IntegerPrinter<Double> integerPrinter1=new IntegerPrinter<>();
        integerPrinter1.setValue(69.69d);
        System.out.println(integerPrinter1.getValue());

        IntegerPrinter<Float> integerPrinter2=new IntegerPrinter<>();
        integerPrinter2.setValue(69.69f);
        System.out.println(integerPrinter2.getValue());

        IntegerPrinter<BigDecimal> integerPrinter3=new IntegerPrinter<>();
        integerPrinter3.setValue(BigDecimal.valueOf(69));
        System.out.println(integerPrinter3.getValue());

        //IntegerPrinter<String> integerPrinter4=new IntegerPrinter<>();
        // NP coz String not a subclass of Number

     }
}
