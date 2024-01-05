package javaRefresher.genericsPractise.TInderProfileMatchSystem;

import java.util.Iterator;

public class Client {
    public static <K, V> void tinderMatch(MyHashMapMap<K, V> boys, MyHashMapMap<K, V> girls) {
        Iterator<Pair<K, V>> iteratorBoys = boys.getEntrySet().iterator();
        Iterator<Pair<K, V>> iteratorGirls = girls.getEntrySet().iterator();

        while (iteratorBoys.hasNext() && iteratorGirls.hasNext()) {
            String template = String.format("%s  is matched to  %s", iteratorBoys.next(), iteratorGirls.next());
            System.out.println(template);
        }
    }

    public static void main(String[] args) {
        MyHashMapMap<String, Integer> boysSchool = new MyHashMapMap<>();
        boysSchool.put("Bhaskar", 16);
        boysSchool.put("Arijit", 13);
        boysSchool.put("Anurag", 11);
        boysSchool.put("Anirban", 17);
        System.out.println(boysSchool.getEntrySet());

        MyHashMapMap<String, Integer> girlsSchool = new MyHashMapMap<>();
        girlsSchool.put("Soumita", 23);
        girlsSchool.put("Anushka", 21);
        girlsSchool.put("Bidisha", 27);
        girlsSchool.put("Shreya", 36);
        System.out.println(girlsSchool.getEntrySet());

        System.out.println("500 jayda le le par match karadey");
        tinderMatch(boysSchool, girlsSchool);
    }
}
