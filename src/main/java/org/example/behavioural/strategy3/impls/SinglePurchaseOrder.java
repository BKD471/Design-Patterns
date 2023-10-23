package org.example.behavioural.strategy3.impls;

import org.example.behavioural.strategy3.context.Order;
import org.example.behavioural.strategy3.strategy.DebitCard;


public class SinglePurchaseOrder extends Order {
    public SinglePurchaseOrder( ) {
        super(new DebitCard());
    }
}
