package behavioural.strategy3.impls;

import behavioural.strategy3.context.Order;
import behavioural.strategy3.strategy.NetBanking;
import behavioural.strategy3.strategy.Upi;


public class BulkOrder extends Order {
    public BulkOrder(){
        super(new NetBanking());
    }
}
