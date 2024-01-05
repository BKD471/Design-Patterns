package javaRefresher.threads.producer_consumer;

import java.util.LinkedList;
import java.util.Queue;

public class Runner {
    public static void main(String[] args) {
        Queue<Integer> buffer=new LinkedList<>();
        int bufferSize=1000;
        SharedResource sharedResource=new SharedResource(buffer,bufferSize);

        Thread producerThread=new Thread(()->{
            for(int i=1;i<=10000;i++){
                try {
                    sharedResource.produce(i);
                } catch (InterruptedException e) {
                     //
                }
            }
        });


        Thread consumerThread=new Thread(()->{
            for(int i=1;i<=10000;i++){
                try{
                    sharedResource.consume();
                }catch (InterruptedException e){
                    //
                }
            }
        });

        producerThread.start();
        consumerThread.start();
    }
}
