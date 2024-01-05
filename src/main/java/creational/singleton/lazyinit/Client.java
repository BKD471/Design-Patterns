package creational.singleton.lazyinit;

public class Client {
    public static void main(String[] args) {
        LazyInit lazyInit=LazyInit.getInstance();
        LazyInit lazyInit1=LazyInit.getInstance();
        System.out.println(lazyInit1);
        System.out.println(lazyInit1);
    }
}
