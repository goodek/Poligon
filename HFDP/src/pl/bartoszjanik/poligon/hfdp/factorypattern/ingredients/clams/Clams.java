package pl.bartoszjanik.poligon.hfdp.factorypattern.ingredients.clams;

/**
 * Created by Bartosz Janik on 2015-06-12.
 */
public abstract class Clams {
    protected String name = "Abstract " + getClass().getSimpleName();

    public String getName() {
        return name;
    }
}
