package creational.factorymethod.lambofactory;

import creational.factorymethod.lambos.Lamborghini;

public abstract class LamboCreator {
    public Lamborghini orderLambo(){
        Lamborghini lamborghini=getLambo();
        return lamborghini;
    }

    public abstract Lamborghini getLambo();
}
