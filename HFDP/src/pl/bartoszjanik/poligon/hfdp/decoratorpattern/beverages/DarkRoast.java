package pl.bartoszjanik.poligon.hfdp.decoratorpattern.beverages;

import pl.bartoszjanik.poligon.hfdp.decoratorpattern.Beverage;

/**
 * Created by bjanik on 2015-06-11.
 */
public class DarkRoast extends Beverage {

    public DarkRoast() {
        description = "Dark roast";
    }

    @Override
    public float cost() {
        return 1.33f;
    }
}
