package javaRefresher.exceptions;

import java.io.IOException;

public class Test {
    public static void main(String[] args) throws IOException {
        throwRuntime();
        throwCheckedException();

        try{
             throwMe(1);
        }catch (ClassNotFoundException | InterruptedException  e1){
            // these must be disjoint to be piped  must not have Isa
            e1.printStackTrace();
        }
        /***
         * catch very specific first
         * if not handled use generic
         * ****/
        catch (Exception e4){
            e4.printStackTrace();
        }
//        }catch (FileNotFoundException e3){
//            e3.printStackTrace();
//        }

        /**
         * catch can only handle exception thrown by try
         * **/
    }

    public static  void throwMe(int v) throws ClassNotFoundException ,InterruptedException{
        switch (v){
            case 1:throw new ClassNotFoundException();
            case 2:throw new InterruptedException();
        }
    }
    public static void throwRuntime(){
        /**
         * compiled exception must be thrown or handled
         * not needed for runtime exception
         * **/
        throw new RuntimeException();
    }

    public static void throwCheckedException() throws IOException {
        throw new IOException();
    }
}
