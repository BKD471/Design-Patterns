package org.example.behavioural.strategy2.strategy.impls;

import org.example.behavioural.strategy2.Order;
import org.example.behavioural.strategy2.strategy.PrinterService;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

public class SummaryReport implements PrinterService {
    /**
     * @param orderList
     */
    @Override
    public void print(Collection<Order> orderList) {
        System.out.println("########### Summary Report ###############################");

        Iterator<Order> iterator= orderList.iterator();
        double grandTotal=0d;
        while (iterator.hasNext()){
            Order order=iterator.next();
            Double subTotal=0d;
            int index=0;
            for(Map.Entry<String,Double> tmp:order.getItems().entrySet()){
                String orders=String.format("%s) %s ---> %s ",index++,tmp.getKey(),tmp.getValue());
                subTotal+=tmp.getValue();
                System.out.println(orders);
            }
            System.out.println("Sub Total: "+subTotal);
            System.out.println("**********************************************************");
            grandTotal+=order.getTotal();
        }
        System.out.println("Your total: "+grandTotal);
        System.out.println("########### End of Report ################################");
    }
}
