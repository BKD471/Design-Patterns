package org.example.behavioural.strategy3.impls;

import org.example.behavioural.strategy3.context.Order;
import org.example.behavioural.strategy3.strategy.NetBanking;
import org.example.behavioural.strategy3.strategy.Upi;


public class BulkOrder extends Order {
    public BulkOrder(){
        super(new NetBanking());
    }
}
