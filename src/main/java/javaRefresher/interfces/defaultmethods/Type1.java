package javaRefresher.interfces.defaultmethods;



interface A1{
    default void m1(){
        System.out.println("I'm m1");
    }
}

interface A2 extends  A1{}

public class Type1 implements  A2{
    public static void main(String[] args) {
        new Type1().m1();
    }
}
