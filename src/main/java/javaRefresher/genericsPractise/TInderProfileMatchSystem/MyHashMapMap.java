package javaRefresher.genericsPractise.TInderProfileMatchSystem;

import java.util.HashSet;
import java.util.Set;

class Pair<T,U>{
    private final T t;
    private final U u;
    Pair(T t,U u){
        this.t=t;
        this.u=u;
    }

    @Override
    public String toString() {
        return  t +" " + u;
    }
}


public class MyHashMapMap<K,V>{
    private K key;
    private V value;
    private final Set<Pair<K,V>> entries=new HashSet<>();
    public void put(K key,V value){
        this.key=key;
        this.value=value;
        Pair<K,V> pair=new Pair<>(key,value);
        entries.add(pair);
    }

    public K getKey(){
        return this.key;
    }
    public V getValue(){
        return this.value;
    }

   public Set<Pair<K,V>> getEntrySet(){
       return entries;
   }
}
