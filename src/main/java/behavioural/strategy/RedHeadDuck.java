package behavioural.strategy;

import behavioural.strategy.context.DuckContext;
import behavioural.strategy.strategy.IFly;
import behavioural.strategy.strategy.IQuack;

public class RedHeadDuck extends DuckContext {
    RedHeadDuck(IFly fly, IQuack quack){
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
