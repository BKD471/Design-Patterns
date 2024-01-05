package behavioural.strategy2.strategy.impls;

import behavioural.strategy2.Order;
import behavioural.strategy2.strategy.PrinterService;

import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;

public class DetailedReport implements PrinterService {
    /**
     * @param orderList
     */
    @Override
    public void print(Collection<Order> orderList) {
        System.out.println("########### Detailed Report ###########################");

        Iterator<Order> iterator= orderList.iterator();
        double grandTotal=0d;
        while (iterator.hasNext()){
            Order order=iterator.next();
            String orderReport=String.format(" id: %s , date: %s, total: %s, itemSize: %s",
                    order.getId(),order.getDate(),order.getTotal(),order.getItems().size());
            System.out.println(orderReport);
            grandTotal+=order.getTotal();
        }
        System.out.println("Your total: "+grandTotal);
        System.out.println("########### End of Report ################################");
    }
}
