package org.example.behavioural.strategy3.strategy;

public class CreditCard implements ITender{
    @Override
    public void pay() {
        System.out.println("Payment Settled through Credit Card");
    }
}
