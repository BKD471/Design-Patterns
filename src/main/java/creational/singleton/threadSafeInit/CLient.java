package creational.singleton.threadSafeInit;

public class CLient {
    public static void main(String[] args) {
        Runnable r=new Runnable() {
            @Override
            public void run() {
                for(int i=0;i<5;i++){
                    ThreadSafeSingleton threadSafeSingleton=ThreadSafeSingleton.getInstance();
                    System.out.println(threadSafeSingleton);
                    try {
                        Thread.sleep(2000);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }
            }
        };

        Thread t=new Thread(r);
        t.start();


        for(int i=0;i<5;i++){
            ThreadSafeSingleton threadSafeSingleton1=ThreadSafeSingleton.getInstance();
            System.out.println(threadSafeSingleton1);
            try {
                Thread.sleep(3000);
            }catch (Exception e){
                e.printStackTrace();
            }
        }
    }
}
