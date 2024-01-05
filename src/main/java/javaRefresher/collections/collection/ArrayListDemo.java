package javaRefresher.collections.collection;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.ListIterator;

public class ArrayListDemo {
    private static List<Integer> getSomeListFOrMe(){
        List<Integer> temp=new ArrayList<>();
        for(int i=0;i<=10;i++) temp.add(i);
        return temp;
    }
    public static void main(String[] args) {
        //get the list
        List<Integer> testList1=getSomeListFOrMe();

        System.out.println("################## Traversal #################################");
        //traverse upward
        ListIterator<Integer> listIterator=testList1.listIterator();
        while(listIterator.hasNext()){
            System.out.print(listIterator.next()+" ");
        }
        System.out.println();
        //traverse downward
        ListIterator<Integer> listIterator1=testList1.listIterator(testList1.size());
        while (listIterator1.hasPrevious()){
            System.out.print(listIterator1.previous()+" ");
        }
        System.out.println();

        System.out.println("################## ReplaceAll #############################");
        List<Integer> testList2=getSomeListFOrMe();
        System.out.println("******** BEFORE ***********");
        System.out.println(testList2);
        System.out.println("******** AFTER ************");
        testList2.replaceAll((Integer v)-> v+69);
        System.out.println(testList2);

        System.out.println("################## sort in Descending#############################");
        List<Integer> testList3=getSomeListFOrMe();
        System.out.println("******** BEFORE ***********");
        System.out.println(testList3);
        Comparator<Integer> c=(a,b)-> -Integer.compare(a,b);
        testList3.sort(c);
        System.out.println("******** AFTER ************");
        System.out.println(testList3);

        System.out.println("################## ADDALL #############################");
        List<Integer> testList4=getSomeListFOrMe();
        List<Integer> testList5=getSomeListFOrMe();
        System.out.println("******** BEFORE ***********");
        System.out.println(testList4);
        System.out.println(testList5);
        System.out.println("******** AFTER ***********");
        testList4.addAll(testList5);
        System.out.println(testList4);

        System.out.println("add at index");
        testList4.addAll(8,testList5);
        System.out.println(testList4);

        System.out.println("################## Sublist #############################");
        List<Integer> testList6=getSomeListFOrMe();
        System.out.println(testList6);
        List<Integer> testList7=testList6.subList(2,8);
        System.out.println(testList7);
    }
}
