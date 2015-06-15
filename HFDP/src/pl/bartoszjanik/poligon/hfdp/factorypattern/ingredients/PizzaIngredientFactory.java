package pl.bartoszjanik.poligon.hfdp.factorypattern.ingredients;

import pl.bartoszjanik.poligon.hfdp.factorypattern.ingredients.cheese.Cheese;
import pl.bartoszjanik.poligon.hfdp.factorypattern.ingredients.clams.Clams;
import pl.bartoszjanik.poligon.hfdp.factorypattern.ingredients.dough.Dough;
import pl.bartoszjanik.poligon.hfdp.factorypattern.ingredients.pepperoni.Pepperoni;
import pl.bartoszjanik.poligon.hfdp.factorypattern.ingredients.sauce.Sauce;
import pl.bartoszjanik.poligon.hfdp.factorypattern.ingredients.veggies.Veggies;

/**
 * Created by Bartosz Janik on 2015-06-12.
 */
public interface PizzaIngredientFactory {
    public Dough createDough();
    public Sauce createSauce();
    public Cheese createCheese();
    public Veggies[] createVeggies();
    public Pepperoni createPepperoni();
    public Clams createClam();
}
