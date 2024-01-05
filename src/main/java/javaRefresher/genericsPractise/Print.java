package javaRefresher.genericsPractise;

public class Print<T> {
    private T value;
    public T getValue(){
        return this.value;
    }
    public void setValue(T value){
        this.value=value;
    }
}