package creational.singleton.eagerInit;

public class EagerInitBlock {
    private static EagerInitBlock instances;

    static {
        try{
            instances=new EagerInitBlock();
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    private EagerInitBlock(){}
    public static EagerInitBlock getInstances(){
        return instances;
    }
}
