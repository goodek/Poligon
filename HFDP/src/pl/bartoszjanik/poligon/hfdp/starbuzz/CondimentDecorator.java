package pl.bartoszjanik.poligon.hfdp.starbuzz;

/**
 * Created by bjanik on 2015-06-11.
 */
public abstract class CondimentDecorator extends Beverage {

    protected Beverage beverage;

    public abstract String getDescription();
}
