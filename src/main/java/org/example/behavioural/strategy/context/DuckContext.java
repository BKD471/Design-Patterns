package org.example.behavioural.strategy.context;

import org.example.behavioural.strategy.strategy.IFly;
import org.example.behavioural.strategy.strategy.IQuack;

public class DuckContext {
    private IFly fly;
    private IQuack quack;
    protected DuckContext(IFly fly, IQuack quack){
        this.fly=fly;
        this.quack=quack;
    }
    public void performFly(){
        fly.fly();
    }
    public void performQuack(){
        quack.quack();
    }
    public void display(){
        //ovveride in child classes
    }

    public void setFly(IFly fly) {
        System.out.println("Chaning the flying behaviour dynamically.......");
        this.fly = fly;
    }
    public void setQuack(IQuack quack) {
        System.out.println("Changing the Quacking behaviour dynamically.......");
        this.quack = quack;
    }
}
