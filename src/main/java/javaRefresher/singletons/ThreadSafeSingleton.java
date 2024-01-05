package javaRefresher.singletons;

public class ThreadSafeSingleton {
    private static ThreadSafeSingleton object;
    private ThreadSafeSingleton(){}
    synchronized public static ThreadSafeSingleton getInstance(){
        if(null==object){
            object=new ThreadSafeSingleton();
        }
        return object;
    }
}

/**
 * Although thread safe, its sequential and slow
 * to overcome use double check
 * **/

class DoubleCheckLocking{
    private static volatile DoubleCheckLocking object;
    private DoubleCheckLocking(){}
    public static DoubleCheckLocking getInstance(){
        if(null==object){
            synchronized (DoubleCheckLocking.class){
                if(null==object){
                    object=new DoubleCheckLocking();
                }
            }
        }
        return object;
    }
}

//Second approach
class BillPough{
    private BillPough(){}

    //nested classes donot loaded at the time of loading outer class
    //its loaded upon request
    private static class BillPoughHelper{
        private static final BillPough object=new BillPough();
    }

    public static BillPough getInstance(){
        return BillPoughHelper.object;
    }
}