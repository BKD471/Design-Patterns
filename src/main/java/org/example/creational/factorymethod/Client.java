package org.example.creational.factorymethod;

import org.example.creational.factorymethod.lambofactory.LamboCreator;
import org.example.creational.factorymethod.lambofactory.impl.AventadorCreator;
import org.example.creational.factorymethod.lambofactory.impl.RevueltoCreator;
import org.example.creational.factorymethod.lambos.Lamborghini;

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
