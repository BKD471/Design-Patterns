package javaRefresher.exceptions;

class MyExceptionA extends Exception{

}

class MyExceptionB extends Exception{

}
public class Runner {
    public static void main(String[] args) throws Exception {
        try {
            throwA();
            throwB();
        } catch (MyExceptionA e){
            System.out.println("Throw A");
        }catch (MyExceptionB e1){
            System.out.println("Throw B");
        }catch (Exception e2){
            System.out.println("Throw C");
        }
    }

    /***
     * Bad programming practice
     * to throw Parent Superclass Exception
     * ****/
    public static void throwA() throws Exception {
        throw  new Exception();
    }

    public static void throwB() throws Exception{
        throw new Exception();
    }
}
