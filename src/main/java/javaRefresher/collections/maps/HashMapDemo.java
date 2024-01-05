package javaRefresher.collections.maps;

import java.util.HashMap;
import java.util.Map;

public class HashMapDemo {
    private static void printMap(Map<Integer,Integer> map){
        for(Map.Entry<Integer,Integer> hash:map.entrySet()){
            System.out.println(hash.getKey()+"----->"+hash.getValue());
        }
        System.out.println();
    }
    public static void main(String[] args) {
        Map<Integer, Integer> hash = new HashMap();
        hash.put(null, 47);
        hash.put(59,null);
        printMap(hash);

        hash.putIfAbsent(null,69);
        hash.putIfAbsent(59,999);
        printMap(hash);
    }
}
