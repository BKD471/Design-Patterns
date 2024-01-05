package javaRefresher.singletons;

public class EagerIniti {
    private static EagerIniti object = new EagerIniti();
    private EagerIniti() {
    }
    public static EagerIniti getInstance() {
        return object;
    }
}
