package org.example.behavioural.strategy3.strategy;

public class GiftVoucher implements ITender{
    @Override
    public void pay() {
        System.out.println("Payment Settled through Gift Voucher");
    }
}
