package pl.bartoszjanik.poligon.hfdp.starbuzz.condiments;

import pl.bartoszjanik.poligon.hfdp.starbuzz.Beverage;
import pl.bartoszjanik.poligon.hfdp.starbuzz.CondimentDecorator;

/**
 * Created by bjanik on 2015-06-11.
 */
public class Whip extends CondimentDecorator {

    public Whip(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public float cost() {
        return beverage.cost() + 0.08f;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + " + whip";
    }
}
