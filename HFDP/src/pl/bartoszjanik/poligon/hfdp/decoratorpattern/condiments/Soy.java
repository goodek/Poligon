package pl.bartoszjanik.poligon.hfdp.decoratorpattern.condiments;

import pl.bartoszjanik.poligon.hfdp.decoratorpattern.Beverage;
import pl.bartoszjanik.poligon.hfdp.decoratorpattern.CondimentDecorator;

/**
 * Created by bjanik on 2015-06-11.
 */
public class Soy extends CondimentDecorator {

    public Soy(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public float cost() {
        return beverage.cost() + 0.12f;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + " + soy";
    }
}
