package javaRefresher.interfces.privatedefaultandstatic;


interface i12{
    void m12();
    default void m123(){
        System.out.println("default hay bro...........");
        m12345();
        m123456();
    }

    static void m1234(){
        System.out.println("static ha bro.......");
        m12345();
       // m123456(); not static
    }

    private  static void m12345(){
        System.out.println("private static method hay bro ...............");

    }

    private void m123456(){
        System.out.println("private method hay bro.......................");
    }
}
public class Demo {
}
