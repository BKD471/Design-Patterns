package creational.singleton.eagerInit;

public class EagerInit {
    private static final EagerInit instances=new EagerInit();
    private EagerInit(){}

    public static EagerInit getInstance(){
        return instances;
    }
}
