package behavioural.strategy3;

import behavioural.strategy3.context.Order;
import behavioural.strategy3.impls.BulkOrder;
import behavioural.strategy3.impls.HighPriorityOrder;
import behavioural.strategy3.impls.SinglePurchaseOrder;

public class Client {
    public static void main(String[] args) {
        Order order1=new BulkOrder();
        order1.settlePayment();

        Order order2=new HighPriorityOrder();
        order1.settlePayment();

        Order order3=new SinglePurchaseOrder();
        order3.settlePayment();
    }
}
