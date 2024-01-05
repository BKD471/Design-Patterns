package behavioural.strategy3.impls;

import behavioural.strategy3.context.Order;
import behavioural.strategy3.strategy.CreditCard;


public class HighPriorityOrder extends Order {
   public HighPriorityOrder(){
        super(new CreditCard());
    }
}
