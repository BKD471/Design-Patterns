package javaRefresher.collections.maps;

import java.util.Iterator;
import java.util.concurrent.ConcurrentHashMap;
import java.util.Set;
public class ThreadSafeSet {
    public static void main(String[] args) {
        ConcurrentHashMap<Integer,Integer> hash=new ConcurrentHashMap<>();
        Set<Integer> threadSafeSet=hash.newKeySet();
        threadSafeSet.add(1);
        threadSafeSet.add(2);

        Iterator<Integer> itr= threadSafeSet.iterator();
        while(itr.hasNext()){
            int v=itr.next();
            if(v==1) threadSafeSet.add(9); //since its threadsafe concurrent update is allowed
        }
        System.out.println(threadSafeSet);
    }
}
