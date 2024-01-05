package javaRefresher.interfces.staticmethods;


interface i1{
    static void m11(){
        System.out.println("Im static");
    }
}
interface  i2 extends  i1{
    //Not possible
//    @Override
//    static void m11(){
//        System.out.println("trying to override static memthod of interface");
//    }
}
public class StaticMethodsTest implements i1{
    public static void main(String[] args) {
        i1.m11();
    }
}
