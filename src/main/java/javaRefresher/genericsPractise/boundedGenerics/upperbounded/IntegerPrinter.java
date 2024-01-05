package javaRefresher.genericsPractise.boundedGenerics.upperbounded;

//T can be Number or its subclass
public class IntegerPrinter<T extends Number> {
    private T value;
    public T getValue(){
        return this.value;
    }
    public void setValue(T t){
        this.value=t;
    }
}
