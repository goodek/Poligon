package pl.bartoszjanik.poligon.hfdp.factorypattern.ingredients.sauce;

/**
 * Created by Bartosz Janik on 2015-06-12.
 */
public abstract class Sauce {
    protected String name = "Abstract " + getClass().getSimpleName();

    public String getName() {
        return name;
    }
}
