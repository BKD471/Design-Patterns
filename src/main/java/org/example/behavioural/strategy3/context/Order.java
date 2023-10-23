package org.example.behavioural.strategy3.context;

import org.example.behavioural.strategy3.strategy.ITender;

public class Order {
    private final ITender tender;

    protected Order(ITender tender){
        this.tender=tender;
    }

    public void settlePayment(){
        tender.pay();
    }
}
