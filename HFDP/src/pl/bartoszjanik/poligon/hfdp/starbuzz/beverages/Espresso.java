package pl.bartoszjanik.poligon.hfdp.starbuzz.beverages;

import pl.bartoszjanik.poligon.hfdp.starbuzz.Beverage;

/**
 * Created by bjanik on 2015-06-11.
 */
public class Espresso extends Beverage {

    public Espresso() {
        description = "Espresso";
    }


    @Override
    public float cost() {
        return 0.87f;
    }
}
