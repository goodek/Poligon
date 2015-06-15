package pl.bartoszjanik.poligon.hfdp.strategypattern;

import pl.bartoszjanik.poligon.hfdp.strategypattern.behaviors.FlyBehavior;
import pl.bartoszjanik.poligon.hfdp.strategypattern.behaviors.QuackBehavior;

/**
 * Created by bjanik on 2015-06-10.
 */
public abstract class Duck {

    protected FlyBehavior flyBehavior;
    protected QuackBehavior quackBehavior;

    Duck() {
    }

    public void swim() {
        System.out.println("We're ducks, we're ducks in tights");
    }

    public abstract void display();

    public void performQuack() {
        quackBehavior.quack();
    }

    public void performFly() {
        flyBehavior.fly();
    }

    public void setFlyBehavior(FlyBehavior flyBehavior) {
        this.flyBehavior = flyBehavior;
    }

    public void setQuackBehavior(QuackBehavior quackBehavior) {
        this.quackBehavior = quackBehavior;
    }
}
