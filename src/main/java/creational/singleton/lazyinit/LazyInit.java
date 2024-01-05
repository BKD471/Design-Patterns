package creational.singleton.lazyinit;

public class LazyInit {
    private static LazyInit instance;
    private LazyInit(){}

    public static LazyInit getInstance(){
        if(instance==null){
            System.out.println("Instance created for first & last time");
            instance=new LazyInit();
        }
        return instance;
    }
}
