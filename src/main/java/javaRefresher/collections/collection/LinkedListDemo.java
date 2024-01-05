package javaRefresher.collections.collection;

import java.util.*;

/***
 * linkedlist descendant of both list and queue
 *
 * *****/
public class LinkedListDemo {
    private static void traveerseeLinkedList(Iterable<Integer> c){
        for (Integer integer : c) {
            System.out.print(integer + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        System.out.println("###################### QUEUE methods #################################");
        Queue<Integer> queue=new LinkedList<>();
        for(int i=0;i<=10;i++) queue.offer(i);
        traveerseeLinkedList(queue);
        queue.poll();
        traveerseeLinkedList(queue);

        System.out.println("##################### DEQUE methods ###################################");
        Deque<Integer> deque=new LinkedList<>();
        for(int i=0;i<10;i++) deque.offerFirst(i-10);
        for (int i=0;i<=10;i++) deque.offerLast(i);
        traveerseeLinkedList(deque);
        for(int i=0;i<5;i++) {
            deque.pollFirst();
            deque.pollLast();
        }
        traveerseeLinkedList(deque);

        System.out.println("##################### List methods ######################################");
        List<Integer> list=new LinkedList<>();
        for(int i=11;i<=21;i++) list.add(i);
        traveerseeLinkedList(list);
        list.remove(6);
        traveerseeLinkedList(list);
        list.remove((Integer) 16);
        traveerseeLinkedList(list);
        //list.remove(999); gives IBE
        list.remove((Integer) 999); //fails silently
        traveerseeLinkedList(list);
    }
}
