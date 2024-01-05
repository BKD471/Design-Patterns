package javaRefresher.collections.iterbales;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;

public class IterablesTest {
    public static void main(String[] args) {
        List<Long> res=new ArrayList<>();
        res.add(69L);res.add(6969L);res.add(696969L);res.add(69696969L);
        res.add(6969696969L);res.add(696969696969L);res.add(69696969696969L);
        res.add(6969696969696969L);res.add(696969696969696969L);

        Iterator<Long> itr=res.iterator();
        while(itr.hasNext()){
            System.out.print(itr.next()+" ");
        }

        AtomicLong sum= new AtomicLong(0L);
        res.forEach(sum::addAndGet);
        System.out.println(sum);
    }
}
