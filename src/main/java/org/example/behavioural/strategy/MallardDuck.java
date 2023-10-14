package org.example.behavioural.strategy;

import org.example.behavioural.strategy.context.DuckContext;
import org.example.behavioural.strategy.strategy.IFly;
import org.example.behavioural.strategy.strategy.IQuack;

public class MallardDuck extends DuckContext {
    MallardDuck(IFly fly, IQuack quack){
        super(fly,quack);
    }

    public void fly(){
        performFly();
    }

    public void quack(){
        performQuack();
    }
    public void display(){
        System.out.println(this.getClass().getSimpleName()+" is in action......");
    }

}
