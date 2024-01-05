package javaRefresher.threads;

public class MonitorLockMain {
    public static void main(String[] args) {
        MonitorLockExample monitorLockExample=new MonitorLockExample();
        Runnable r= monitorLockExample::task1;
        Thread t1=new Thread(r);
        Thread t2=new Thread(monitorLockExample::task2);
        Thread t3=new Thread(monitorLockExample::task3);

        t1.start();
        t2.start();
        t3.start();
    }
}
