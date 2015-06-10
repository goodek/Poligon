package pl.bartoszjanik.poligon.hfdp.ducks.behaviorsimpl;

import pl.bartoszjanik.poligon.hfdp.ducks.behaviors.QuackBehavior;

/**
 * Created by bjanik on 2015-06-10.
 */
public class Quack implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("QUAAAACK");
    }
}
