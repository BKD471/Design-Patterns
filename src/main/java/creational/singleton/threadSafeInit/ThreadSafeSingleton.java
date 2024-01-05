package creational.singleton.threadSafeInit;

public class ThreadSafeSingleton {
    private static  ThreadSafeSingleton threadSafeSingleton;

    private ThreadSafeSingleton(){
    }

    public static ThreadSafeSingleton getInstance(){
            synchronized (ThreadSafeSingleton.class){
                if(threadSafeSingleton==null){
                    threadSafeSingleton=new ThreadSafeSingleton();
                }
        }
        return threadSafeSingleton;
    }
}
