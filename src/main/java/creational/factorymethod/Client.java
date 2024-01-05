package creational.factorymethod;

import creational.factorymethod.lambofactory.LamboCreator;
import creational.factorymethod.lambofactory.impl.AventadorCreator;
import creational.factorymethod.lambofactory.impl.RevueltoCreator;
import creational.factorymethod.lambos.Lamborghini;

public class Client {
    public static void main(String[] args) {
       display(new AventadorCreator());
       display(new RevueltoCreator());
    }

    private static void display(LamboCreator lamboCreator){
        Lamborghini lamborghini= lamboCreator.orderLambo();
        System.out.println(lamborghini);
    }
}
