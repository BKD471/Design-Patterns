package javaRefresher.nestedclasses;

import javax.swing.plaf.TableHeaderUI;
import java.io.IOException;

abstract class SomeLogic{
    abstract void logic();
    abstract int count();
}

public class Aic {
    public static void main(String[] args) {
        SomeLogic someLogic=new SomeLogic() {
            @Override
            void logic() {
                System.out.println("Executing some logic........");
            }

            @Override
            int count() {
                return 69;
            }
        };

        someLogic.logic();
        System.out.println(someLogic.count());


        Runnable runnable=new Runnable() {
            @Override
            public void run() {
                for(int i=0;i<5;i++){
                    try{
                        Thread.sleep(5000);
                        System.out.println("I love you Nandini.........");
                    }catch (InterruptedException e){
                        e.printStackTrace();
                    }
                }
            }
        };
        Thread thread=new Thread(runnable);
        thread.start();
    }
}
