package pl.bartoszjanik.poligon.hfdp.strategypattern.behaviorsimpl;

import pl.bartoszjanik.poligon.hfdp.strategypattern.behaviors.FlyBehavior;

/**
 * Created by bjanik on 2015-06-10.
 */
public class FlyNoWay implements FlyBehavior {

    @Override
    public void fly() {
        System.out.println("I can't fly");
    }
}
