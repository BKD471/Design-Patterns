package javaRefresher.genericsPractise.boundedGenerics.multibound.ootbclasses;

import javaRefresher.genericsPractise.boundedGenerics.multibound.ootbclasses.AbstractWriter;
import javaRefresher.genericsPractise.boundedGenerics.multibound.ootbclasses.IimageService;

public class Print <T extends AbstractWriter & IimageService & IPdfService>{
    private T value;
    public T getValue(){
       return  this.value;
    }
    public void setValue(T value){
        this.value=value;
    }

    @Override
    public String toString() {
        return "Print{" +
                "value=" + value +
                '}';
    }
}
