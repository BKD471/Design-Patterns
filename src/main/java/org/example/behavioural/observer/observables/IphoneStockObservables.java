package org.example.behavioural.observer.observables;

import org.example.behavioural.observer.observer.NotificationAlertObserver;

import java.util.ArrayList;
import java.util.List;

public class IphoneStockObservables implements StockObservables {
    private  List<NotificationAlertObserver> observerList;
    private int stockCount=0;

    public IphoneStockObservables(){
        this.observerList=new ArrayList<>();
    }

    /**
     * @param observer
     */
    @Override
    public void add(NotificationAlertObserver observer) {
        observerList.add(observer);
    }

    /**
     * @param observer
     */
    @Override
    public void remove(NotificationAlertObserver observer) {
        observerList.remove(observer);
    }

    /**
     *
     */
    @Override
    public void notfiySubscribers() {
        for(NotificationAlertObserver observer:observerList){
            observer.update();
        }
    }

    /**
     * @param newQuantityAdded
     */
    @Override
    public void addStock(int newQuantityAdded){
        if(newQuantityAdded==0) return;;
        if(stockCount==0){
            this.stockCount=newQuantityAdded;
            notfiySubscribers();
        }else{
            this.stockCount+=newQuantityAdded;
        }
    }
    @Override
    public void removeStock(int quantityRemoved){
        if(quantityRemoved==0 || stockCount==0 || quantityRemoved>stockCount) return;;
        this.stockCount-=quantityRemoved;
    }

    @Override
    public void setStock(int newQuantity){
        if(newQuantity==0){
            this.stockCount=0;
            return;
        }
        if(stockCount==0){
            this.stockCount=newQuantity;
            notfiySubscribers();
        }else this.stockCount=newQuantity;
    }

    /**
     * @return
     */
    @Override
    public int getStockCount() {
        return this.stockCount;
    }
}
