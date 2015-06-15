package pl.bartoszjanik.poligon.hfdp.strategypattern;

import pl.bartoszjanik.poligon.hfdp.strategypattern.behaviorsimpl.FlyNoWay;
import pl.bartoszjanik.poligon.hfdp.strategypattern.behaviorsimpl.Quack;

/**
 * Created by bjanik on 2015-06-10.
 */
public class ModelDuck extends Duck {

    public ModelDuck() {
        flyBehavior = new FlyNoWay();
        quackBehavior = new Quack();
    }

    @Override
    public void display() {
        System.out.println("I'm a model duck");
    }
}
