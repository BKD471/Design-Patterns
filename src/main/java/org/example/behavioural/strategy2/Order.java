package org.example.behavioural.strategy2;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;

public class Order {
    private String id;
    private double total;
    private LocalDate date;
    private final Map<String,Double> items=new HashMap<>();

    public Order(String id){
        this.id=id;
        this.date=LocalDate.now();
    }
    public void addItems(String product,Double price){
        items.put(product,price);
    }
    public double getTotal(){
        Double temp=0d;
        for(Map.Entry<String,Double> tmp:items.entrySet()){
            temp+=tmp.getValue();
        }
        this.total=temp;
        return this.total;
    }

    public String getId() {
        return id;
    }

    public Map<String, Double> getItems() {
        return items;
    }

    public LocalDate getDate(){
        return this.date;
    }
}
