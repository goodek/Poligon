package pl.bartoszjanik.poligon.hfdp.ducks;

import pl.bartoszjanik.poligon.hfdp.ducks.behaviorsimpl.FlyWithWings;
import pl.bartoszjanik.poligon.hfdp.ducks.behaviorsimpl.Quack;

/**
 * Created by bjanik on 2015-06-10.
 */
public class MallardDuck extends Duck {

    public MallardDuck() {
        quackBehavior = new Quack();
        flyBehavior = new FlyWithWings();
    }

    @Override
    public void display() {
        System.out.println("I'm a Mallard Duck!");
    }
}

