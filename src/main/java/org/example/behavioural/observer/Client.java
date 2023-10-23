package org.example.behavioural.observer;

import org.example.behavioural.observer.observables.IphoneStockObservables;
import org.example.behavioural.observer.observables.MackBookAirStockObservables;
import org.example.behavioural.observer.observables.StockObservables;
import org.example.behavioural.observer.observer.EmailAlertObserverImpl;
import org.example.behavioural.observer.observer.NotificationAlertObserver;
import org.example.behavioural.observer.observer.SmsAlertObserverImpl;

public class Client {
    public static void main(String[] args) {
        StockObservables mackBookAirStockObservables=new MackBookAirStockObservables();

        NotificationAlertObserver observer1=new EmailAlertObserverImpl("phoenix@gmail.com",mackBookAirStockObservables);
        NotificationAlertObserver observer2=new EmailAlertObserverImpl("abcd@gmail.com",mackBookAirStockObservables);
        NotificationAlertObserver observer3=new SmsAlertObserverImpl("+91-69696969",mackBookAirStockObservables);

        mackBookAirStockObservables.add(observer1);
        mackBookAirStockObservables.add(observer2);
        mackBookAirStockObservables.add(observer3);

        mackBookAirStockObservables.addStock(10);
        mackBookAirStockObservables.removeStock(10);
        mackBookAirStockObservables.setStock(10);

    }
}
