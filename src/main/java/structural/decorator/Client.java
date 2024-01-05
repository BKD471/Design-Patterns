package structural.decorator;

import structural.decorator.base.BasePizza;
import structural.decorator.base.impls.MargharitaImpl;
import structural.decorator.toppings.ToppingsDecorator;
import structural.decorator.toppings.impls.ExtraCheeseToppingsImpl;
import structural.decorator.toppings.impls.JalapenoToppingsImpl;
import structural.decorator.toppings.impls.RoastedMushroomToppingsImpl;

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
