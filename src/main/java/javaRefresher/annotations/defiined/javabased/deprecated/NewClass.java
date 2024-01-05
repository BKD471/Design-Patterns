package javaRefresher.annotations.defiined.javabased.deprecated;

public class NewClass {
    @Deprecated
    public void deprecatredMethod(){
        System.out.println("I am deprecated");
    }

    public  void newUpdatedMethod(){
        System.out.println("I am modern");
    }
}
