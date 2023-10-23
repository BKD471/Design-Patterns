package org.example.behavioural.strategy3.impls;

import org.example.behavioural.strategy3.context.Order;
import org.example.behavioural.strategy3.strategy.CreditCard;


public class HighPriorityOrder extends Order {
   public HighPriorityOrder(){
        super(new CreditCard());
    }
}
