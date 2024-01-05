package behavioural.strategy;

import behavioural.strategy.context.DuckContext;
import behavioural.strategy.strategy.impls.CannotFly;
import behavioural.strategy.strategy.impls.FlyWithWings;
import behavioural.strategy.strategy.impls.MuteQuack;
import behavioural.strategy.strategy.impls.Quack;

public class Client {
    public static void main(String[] args) {
        DuckContext mallarDuck=
                new MallardDuck(new FlyWithWings(),new Quack());

        mallarDuck.display();
        mallarDuck.performFly();
        mallarDuck.performQuack();

        mallarDuck.setFly(new CannotFly());
        mallarDuck.performFly();
        mallarDuck.setQuack(new MuteQuack());
        mallarDuck.performQuack();

        System.out.println("#############################################################");
        DuckContext rubberDuck=
                new RubberDuck(new CannotFly(),new MuteQuack());

        rubberDuck.display();
        rubberDuck.performFly();
        rubberDuck.performQuack();

        rubberDuck.setFly(new FlyWithWings());
        rubberDuck.performFly();
        rubberDuck.setQuack(new Quack());
        rubberDuck.performQuack();
    }
}
