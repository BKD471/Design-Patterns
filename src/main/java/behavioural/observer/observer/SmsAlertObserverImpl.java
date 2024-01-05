package behavioural.observer.observer;

import behavioural.observer.observables.StockObservables;

public class SmsAlertObserverImpl implements NotificationAlertObserver{
    private final String phoneNumber;
    private final StockObservables stockObservables;

    public SmsAlertObserverImpl(String phoneNumber, StockObservables stockObservables){
        this.phoneNumber=phoneNumber;
        this.stockObservables=stockObservables;
    }
    /**
     *
     */
    @Override
    public void update() {
       sendSms(phoneNumber,String.format
               ("Product has been refilled, New  Quantuty is %s, Please Hurry Up",stockObservables.getStockCount()));

    }

    private void sendSms(String phoneNumber,String message){
        System.out.println(String.format("SMS sent  to%s  ########################## %s",phoneNumber,message));
    }
}
