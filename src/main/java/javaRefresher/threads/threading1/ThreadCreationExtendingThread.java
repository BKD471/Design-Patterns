package javaRefresher.threads.threading1;


class Thread1 extends Thread{
    @Override
    public void run() {
        for(int i=0;i<=10;i++) System.out.print("Passed "+i);
    }
}
public class ThreadCreationExtendingThread{
    public static void main(String[] args) {
        Thread1 t1=new Thread1();
        t1.start();
    }
}


