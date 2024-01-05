package behavioural.strategy3.impls;

import behavioural.strategy3.context.Order;
import behavioural.strategy3.strategy.DebitCard;


public class SinglePurchaseOrder extends Order {
    public SinglePurchaseOrder( ) {
        super(new DebitCard());
    }
}
