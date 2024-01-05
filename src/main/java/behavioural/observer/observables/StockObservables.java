package behavioural.observer.observables;

import behavioural.observer.observer.NotificationAlertObserver;

public interface StockObservables {
    void add(NotificationAlertObserver observer);
    void remove(NotificationAlertObserver observer);
    void notfiySubscribers();
    void addStock(int newProductAdded);
    void removeStock(int quantityRemoved);
    void setStock(int newQuantity);
    int getStockCount();
}
