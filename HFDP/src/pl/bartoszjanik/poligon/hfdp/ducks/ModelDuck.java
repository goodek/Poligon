package pl.bartoszjanik.poligon.hfdp.ducks;

import pl.bartoszjanik.poligon.hfdp.ducks.behaviorsimpl.FlyNoWay;
import pl.bartoszjanik.poligon.hfdp.ducks.behaviorsimpl.Quack;

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
