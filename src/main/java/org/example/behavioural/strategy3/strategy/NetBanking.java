package org.example.behavioural.strategy3.strategy;

public class NetBanking implements ITender{
    @Override
    public void pay() {
        System.out.println("Payment Settled through NetBanking");
    }
}
