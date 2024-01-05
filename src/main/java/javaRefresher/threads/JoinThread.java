package javaRefresher.threads;

public class JoinThread {
    public static void main(String[] args) throws InterruptedException{
        Thread t=new Thread(()->{
            for(int i=1;i<=10;i++) {
                try {
                    Thread.sleep(2000);
                    System.out.println("Custom Thread");
                }catch (InterruptedException e){
                    //
                }
            }
        });
        t.start();
        t.join();  //main thread is waiting for t thread to finish
        // and main thread it will continue
        System.out.println("Main Thread finished");
    }
}
