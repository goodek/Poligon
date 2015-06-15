package pl.bartoszjanik.poligon.hfdp.factorypattern.ingredients;

import pl.bartoszjanik.poligon.hfdp.factorypattern.ingredients.cheese.Cheese;
import pl.bartoszjanik.poligon.hfdp.factorypattern.ingredients.cheese.ReggianoCheese;
import pl.bartoszjanik.poligon.hfdp.factorypattern.ingredients.clams.Clams;
import pl.bartoszjanik.poligon.hfdp.factorypattern.ingredients.clams.FreshClams;
import pl.bartoszjanik.poligon.hfdp.factorypattern.ingredients.dough.Dough;
import pl.bartoszjanik.poligon.hfdp.factorypattern.ingredients.dough.ThinCrustDough;
import pl.bartoszjanik.poligon.hfdp.factorypattern.ingredients.pepperoni.Pepperoni;
import pl.bartoszjanik.poligon.hfdp.factorypattern.ingredients.pepperoni.SlicedPepperoni;
import pl.bartoszjanik.poligon.hfdp.factorypattern.ingredients.sauce.MarinaraSauce;
import pl.bartoszjanik.poligon.hfdp.factorypattern.ingredients.sauce.Sauce;
import pl.bartoszjanik.poligon.hfdp.factorypattern.ingredients.veggies.*;

/**
 * Created by Bartosz Janik on 2015-06-12.
 */
public class NYPizzaIngredientFactory implements PizzaIngredientFactory {

    @Override
    public Dough createDough() {
        return new ThinCrustDough();
    }

    @Override
    public Sauce createSauce() {
        return new MarinaraSauce();
    }

    @Override
    public Cheese createCheese() {
        return new ReggianoCheese();
    }

    @Override
    public Veggies[] createVeggies() {
        Veggies veggies[] = { new Garlic(), new Onion(), new Mushroom(), new RedPepper()};
        return veggies;
    }

    @Override
    public Pepperoni createPepperoni() {
        return new SlicedPepperoni();
    }

    @Override
    public Clams createClam() {
        return new FreshClams();
    }
}
