package behavioural.strategy2.context;

import behavioural.strategy2.Order;
import behavioural.strategy2.strategy.PrinterService;

import java.util.LinkedList;

public class PrinterContext {
    private PrinterService printerService;

    public PrinterContext(PrinterService printerService){
        this.printerService=printerService;
    }

    public void getPrint(LinkedList<Order> ordderList){
        printerService.print(ordderList);
    }
}
