package behavioural.strategy2;

import behavioural.strategy2.context.PrinterContext;
import behavioural.strategy2.strategy.impls.DetailedReport;
import behavioural.strategy2.strategy.impls.SummaryReport;

import java.util.LinkedList;

public class Client {
    private static final LinkedList<Order> orderList=new LinkedList<>();
    public static void main(String[] args) {
        createOrders();
        PrinterContext context=new PrinterContext(new SummaryReport());
        context.getPrint(orderList);
    }

    public static void createOrders(){
        Order order1=new Order("1000");
        order1.addItems("Margharita",500d);
        order1.addItems("Pepperoni",350d);
        order1.addItems("FarmHouse Pizza",450d);
        order1.addItems("Garlic Bread",30d);
        order1.addItems("Coke",40d);
        orderList.add(order1);

        //
        Order order2=new Order("2000");
        order2.addItems("Peri Peri Chicken",500d);
        order2.addItems("Chicken Popcorn",158d);
        order2.addItems("Crispy Chicken",768d);
        order2.addItems("Chicken Biriyani Bucket",230d);
        order2.addItems("Coke",40d);
        orderList.add(order2);

    }
}
