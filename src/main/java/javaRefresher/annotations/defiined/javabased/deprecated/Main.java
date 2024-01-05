package javaRefresher.annotations.defiined.javabased.deprecated;

public class Main {
    @SuppressWarnings("deprecation") //for supressing deprecations
    //@SuppressWarnings("all") for all
    public static void main(String[] args) {
        OldClass old=new OldClass(); //gives off compl time warnings

        NewClass newClass=new NewClass();
        newClass.deprecatredMethod();//warn
        newClass.newUpdatedMethod();
    }
}
