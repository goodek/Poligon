package pl.bartoszjanik.poligon.hfdp.decoratorpattern.beverages;

import pl.bartoszjanik.poligon.hfdp.decoratorpattern.Beverage;

/**
 * Created by bjanik on 2015-06-11.
 */
public class Decaf extends Beverage {
    public Decaf() {
        description = "Decaf";
    }


    @Override
    public float cost() {
        return 1.25f;
    }
}
