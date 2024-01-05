package javaRefresher.collections.collection;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.PriorityQueue;

public class Heaps{
    public static void main(String[] args) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for (int i = 10; i >= 0; i--) pq.offer(i);

        //all heaps in java are by default min heaps
        System.out.println("################### MIN HEAP ######################");
        System.out.println(pq);
        while (!pq.isEmpty()) System.out.print(pq.poll() + "-->");
        System.out.println();

        //max heap
        System.out.println("#################### MAX HEAP #####################");
        Comparator<Integer> c = (a, b) -> b.compareTo(a);
        pq = new PriorityQueue<>(c);
        for (int i = 0; i <= 10; i++) pq.offer(i);

        System.out.println(pq);
        while (!pq.isEmpty()) System.out.print(pq.poll() + "-->");

        //tc
        /* add offer logn
         *oeek 1
         *poll  logn
         * remove O(n)
         * ***/
    }
}
