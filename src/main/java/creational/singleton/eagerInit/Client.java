package creational.singleton.eagerInit;

public class Client {
    public static void main(String[] args) {
        EagerInit instances=EagerInit.getInstance();
        EagerInit instances1=EagerInit.getInstance();
        System.out.println(instances);
        System.out.println(instances1);


        EagerInitBlock instances2=EagerInitBlock.getInstances();
        EagerInitBlock instances3=EagerInitBlock.getInstances();
        System.out.println(instances2);
        System.out.println(instances3);
    }
}
