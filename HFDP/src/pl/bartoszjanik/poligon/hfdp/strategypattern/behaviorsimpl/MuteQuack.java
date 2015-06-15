package pl.bartoszjanik.poligon.hfdp.strategypattern.behaviorsimpl;

import pl.bartoszjanik.poligon.hfdp.strategypattern.behaviors.QuackBehavior;

/**
 * Created by bjanik on 2015-06-10.
 */
public class MuteQuack implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("<< Silence >>");
    }
}
