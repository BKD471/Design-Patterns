package javaRefresher.threads.producer_consumer;

import java.util.Queue;

public class SharedResource {
    private final Queue<Integer> sharedBuffer;
    private final int bufferSize;

    SharedResource(Queue<Integer> sharedBuffer,int bufferSize){
        this.sharedBuffer=sharedBuffer;
        this.bufferSize=bufferSize;
    }

    public  synchronized void produce(int item) throws InterruptedException{
        while(sharedBuffer.size()==bufferSize){
            System.out.println("Buffer is full, Producer is waiting for consumer to consume");
            wait();
        }

        sharedBuffer.add(item);
        System.out.printf("Producer produced %s to the queue \n",item);
        //notify consumer  there are items to consume
        notify();
    }

    public synchronized int consume() throws InterruptedException{
        while(sharedBuffer.isEmpty()){
            System.out.print("Buffer is empty, consumer is waiting........");
            wait();
        }

        int item=sharedBuffer.poll();
        System.out.println("Consumed "+item);
        //notify producer , the buffer is ready to be pushed into
        notify();
        return item;
    }
}
