package javaRefresher.genericsPractise;

public class Coordinates<T extends Number,U extends Number> {
    private final T first;
    private final U second;
    Coordinates(T t,U u){
        this.first=t;
        this.second=u;
    }
}
