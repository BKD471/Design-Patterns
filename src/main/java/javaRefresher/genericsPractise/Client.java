package javaRefresher.genericsPractise;


public class Client {
    public static void main(String[] args) {
        Print<Integer> printInteger=new Print<>();
        printInteger.setValue(69);
        System.out.println(printInteger.getValue());

        Print<String> printString=new Print<>();
        printString.setValue("Tera baap hu main");
        System.out.println(printString.getValue());

        //parametrized type
        Print<String> colorPrint=new ColorPrint();
        colorPrint.setValue("Printing with color Blue & Black");
        System.out.println(colorPrint.getValue());

        //raw type
        // its  by default getting Print<Object>
        Print rawColorPrint=new ColorPrint();
        rawColorPrint.setValue("Printing with raw color Blue & Black");
        System.out.println(rawColorPrint.getValue());
    }
}
