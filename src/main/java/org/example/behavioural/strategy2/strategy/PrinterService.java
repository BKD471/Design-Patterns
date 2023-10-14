package org.example.behavioural.strategy2.strategy;

import org.example.behavioural.strategy2.Order;

import java.util.Collection;
import java.util.LinkedList;

public interface PrinterService {
    void print(Collection<Order> orderList);
}
