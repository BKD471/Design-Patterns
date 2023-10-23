package org.example.behavioural.observer.observer;

import org.example.behavioural.observer.observables.StockObservables;

public class EmailAlertObserverImpl implements  NotificationAlertObserver{
    private final String emailId;
    private final StockObservables stockObservables;

    public EmailAlertObserverImpl(String emailId,StockObservables stockObservables){
        this.emailId=emailId;
        this.stockObservables=stockObservables;
    }

    /**
     *
     */
    @Override
    public void update() {
          sendEmail(emailId,String.format(
                  "Product has been refilled.Current Qiantity is %s Please Hurry Up!!",stockObservables.getStockCount()));
    }

    private void sendEmail(String emailId,String message){
        System.out.println(String.format(" Mail received %s ###########################################> %s",emailId,message));
    }
}
