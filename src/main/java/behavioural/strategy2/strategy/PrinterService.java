package behavioural.strategy2.strategy;

import behavioural.strategy2.Order;

import java.util.Collection;
import java.util.LinkedList;

public interface PrinterService {
    void print(Collection<Order> orderList);
}
