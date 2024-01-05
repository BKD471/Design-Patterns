package javaRefresher.threads;

public class MonitorLockExample {
    public synchronized void task1(){
       try{
           System.out.println("Inside Task1 .................");
           Thread.sleep(3000);
           System.out.println("Task1 Completed ..............");
       }catch (Exception e){
           e.printStackTrace();
       }
    }

    public void task2(){
        System.out.println("task2, Before Synchronized .............");
        synchronized (this){
            System.out.println("task2, Inside Synchronized...........");
        }
    }

    public void task3(){
        System.out.println("Inside Task3.....................");
    }
}
