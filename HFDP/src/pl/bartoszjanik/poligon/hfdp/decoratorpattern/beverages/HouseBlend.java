package pl.bartoszjanik.poligon.hfdp.decoratorpattern.beverages;

import pl.bartoszjanik.poligon.hfdp.decoratorpattern.Beverage;

/**
 * Created by bjanik on 2015-06-11.
 */
public class HouseBlend extends Beverage {

    public HouseBlend() {
        description = "House blend";
    }

    @Override
    public float cost() {
        return 1.34f;
    }
}
