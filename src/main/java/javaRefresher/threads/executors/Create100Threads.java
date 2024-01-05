package javaRefresher.threads.executors;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Create100Threads {
    public static void main(String[] args) {

        ExecutorService executorService= Executors.newFixedThreadPool(10);
        for(int i=1;i<=100;i++){
            int finalI = i;
            executorService.submit(()->{
                System.out.printf("%s ---> %s%n",finalI,Thread.currentThread().getName());
            })  ;
        }

        executorService.shutdown();
    }
}
