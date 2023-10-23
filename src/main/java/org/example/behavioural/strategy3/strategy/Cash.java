package org.example.behavioural.strategy3.strategy;

public class Cash implements  ITender{

    /**
     *
     */
    @Override
    public void pay() {
        System.out.println("Payment Settled through Cash");
    }
}
