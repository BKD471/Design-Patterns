package javaRefresher.interfces.defaultmethods;

//was default ,make it to abstract
interface A3{
    default void m3(){
        System.out.println("Im m4");
    }
}

interface  A4 extends A3{
    @Override
    void m3();
}
public class Type2 implements A4{
    public void  m3(){
        System.out.println("Ovverriden the default");
    }
    public static void main(String[] args) {

    }
}
