package javaRefresher.threads.threading1;

public class ThreadCreationRunnable {
    public static void main(String[] args) {

//        Thread t=new Thread(new Runnable() {
//            @Override
//            public void run() {
//                for(int i=0;i<=10;i++) System.out.println("Passed "+i);
//            }
//        });
//        t.start();

        Thread t=new Thread(()->{
                for(int i=0;i<=10;i++) System.out.println("Passed "+i);
        });
        t.start();
    }
}
