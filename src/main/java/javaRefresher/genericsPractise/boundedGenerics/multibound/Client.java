package javaRefresher.genericsPractise.boundedGenerics.multibound;

import javaRefresher.genericsPractise.boundedGenerics.multibound.ootbclasses.Print;

import java.util.UUID;

public class Client {
    public static void main(String[] args) {
        Order myOrder=new Order(UUID.randomUUID()
                ,"MacBook Air",156000.0d);

        Print<Order> printMyOrder=new Print<>();

        printMyOrder.setValue(myOrder);
        System.out.println(printMyOrder);

        NotSuitableCLass notSuitableCLass=new NotSuitableCLass();
        //Print<NotSuitableCLass> notSuitableCLassPrint=new Print<NotSuitableCLass>();
        // Np NotSuitableCLass doesnot comply the contarint of print
    }
}
