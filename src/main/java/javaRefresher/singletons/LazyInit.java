package javaRefresher.singletons;

public class LazyInit {
    private static LazyInit object;
    private LazyInit(){}
    public static LazyInit getInstance(){
        if(null==object){
            object=new LazyInit();
        }
        return object;
    }
}
