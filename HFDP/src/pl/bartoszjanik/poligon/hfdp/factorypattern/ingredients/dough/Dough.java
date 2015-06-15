package pl.bartoszjanik.poligon.hfdp.factorypattern.ingredients.dough;

/**
 * Created by Bartosz Janik on 2015-06-12.
 */
public abstract class Dough {
    protected String name = "Abstract " + getClass().getSimpleName();

    public String getName() {
        return name;
    }
}
