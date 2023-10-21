package org.example.creational.factorymethod.lambofactory;

import org.example.creational.factorymethod.lambos.Lamborghini;

public abstract class LamboCreator {
    public Lamborghini orderLambo(){
        Lamborghini lamborghini=getLambo();
        return lamborghini;
    }

    public abstract Lamborghini getLambo();
}
