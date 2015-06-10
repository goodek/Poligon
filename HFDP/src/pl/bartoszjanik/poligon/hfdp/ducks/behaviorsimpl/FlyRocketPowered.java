package pl.bartoszjanik.poligon.hfdp.ducks.behaviorsimpl;

import pl.bartoszjanik.poligon.hfdp.ducks.behaviors.FlyBehavior;

/**
 * Created by bjanik on 2015-06-10.
 */
public class FlyRocketPowered implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("I'm flying rocket powered");
    }
}
