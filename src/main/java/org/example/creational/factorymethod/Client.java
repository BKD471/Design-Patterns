package org.example.creational.factorymethod;

import org.example.creational.factorymethod.lambofactory.LamboCreator;
import org.example.creational.factorymethod.lambofactory.impl.AventadorCreator;
import org.example.creational.factorymethod.lambofactory.impl.RevueltoCreator;
import org.example.creational.factorymethod.lambos.Lamborghini;

public class Client {
    public static void main(String[] args) {
        //Aventador
        LamboCreator lamboCreator=new AventadorCreator();
        Lamborghini lamborghini=lamboCreator.orderLambo();
        System.out.println(lamborghini);

        //
        LamboCreator lamboCreator1=new RevueltoCreator();
        Lamborghini lamborghini1=lamboCreator1.orderLambo();
        System.out.println(lamborghini1);
    }
}
