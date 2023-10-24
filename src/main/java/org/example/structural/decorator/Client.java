package org.example.structural.decorator;

import org.example.structural.decorator.base.BasePizza;
import org.example.structural.decorator.base.impls.MargharitaImpl;
import org.example.structural.decorator.toppings.ToppingsDecorator;
import org.example.structural.decorator.toppings.impls.ExtraCheeseToppingsImpl;
import org.example.structural.decorator.toppings.impls.JalapenoToppingsImpl;
import org.example.structural.decorator.toppings.impls.RoastedMushroomToppingsImpl;

public class Client {
    public static void main(String[] args) {
        //Margharita + extra cheese
        BasePizza pizza=new MargharitaImpl();
        ToppingsDecorator topings=new ExtraCheeseToppingsImpl(pizza);
        System.out.println("Cart cost now "+topings.cost());

        //margharita + extra cheese + jalapeno
        ToppingsDecorator extraToppings=new JalapenoToppingsImpl(topings);
        System.out.println("Cart cost now "+extraToppings.cost());

        //margharita + extra chese + jalapeno + roasted Mushrroom
        ToppingsDecorator extrassss=new RoastedMushroomToppingsImpl(extraToppings);
        System.out.println("Cart cost now "+extrassss.cost());
    }
}
