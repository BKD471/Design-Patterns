package org.example.behavioural.strategy3.strategy;

public class DebitCard implements ITender{
    @Override
    public void pay() {
        System.out.println("Payment Settled through DebitCard");
    }
}
