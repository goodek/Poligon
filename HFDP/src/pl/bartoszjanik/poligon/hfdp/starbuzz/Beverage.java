package pl.bartoszjanik.poligon.hfdp.starbuzz;

/**
 * Created by bjanik on 2015-06-11.
 */
public abstract class Beverage {
    protected String description = "Unknown beverage";

    public abstract float cost();

    public String getDescription() {
        return description;
    }
}
