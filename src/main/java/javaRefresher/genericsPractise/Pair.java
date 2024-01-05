package javaRefresher.genericsPractise;

public class Pair<T,U> {
    private  T first;
    private  U second;
    Pair(T t,U u){
        this.first=t;
        this.second=u;
    }

    public T getFirst() {
        return first;
    }

    public void setFirst(T first) {
        this.first = first;
    }

    public U getSecond() {
        return second;
    }

    public void setSecond(U second) {
        this.second = second;
    }

    //// GENERIC static methods
    //we know placeholder <T>'s value when creating object
    //but its static method, we call it without creating object for class Pair
    //so we dont value of <T>
    public static <T> void doIt(T t){
        System.out.println("rgr");
        //this <T> is not same as <T> in class Pair<T,U>
    }

    public static <X> X doIts(X a,X b){
        return a;
    }
}
