package pl.bartoszjanik.poligon.hfdp.factorypattern.ingredients;

import pl.bartoszjanik.poligon.hfdp.factorypattern.ingredients.cheese.Cheese;
import pl.bartoszjanik.poligon.hfdp.factorypattern.ingredients.cheese.MozarellaChesse;
import pl.bartoszjanik.poligon.hfdp.factorypattern.ingredients.clams.Clams;
import pl.bartoszjanik.poligon.hfdp.factorypattern.ingredients.clams.FrozenClam;
import pl.bartoszjanik.poligon.hfdp.factorypattern.ingredients.dough.Dough;
import pl.bartoszjanik.poligon.hfdp.factorypattern.ingredients.dough.ThickCrustDough;
import pl.bartoszjanik.poligon.hfdp.factorypattern.ingredients.pepperoni.Pepperoni;
import pl.bartoszjanik.poligon.hfdp.factorypattern.ingredients.pepperoni.SlicedPepperoni;
import pl.bartoszjanik.poligon.hfdp.factorypattern.ingredients.sauce.PlumTomatoSauce;
import pl.bartoszjanik.poligon.hfdp.factorypattern.ingredients.sauce.Sauce;
import pl.bartoszjanik.poligon.hfdp.factorypattern.ingredients.veggies.BlackOlives;
import pl.bartoszjanik.poligon.hfdp.factorypattern.ingredients.veggies.EggPlant;
import pl.bartoszjanik.poligon.hfdp.factorypattern.ingredients.veggies.Spinach;
import pl.bartoszjanik.poligon.hfdp.factorypattern.ingredients.veggies.Veggies;

/**
 * Created by Bartosz Janik on 2015-06-12.
 */
public class ChicagoIngredientFactory implements PizzaIngredientFactory {
    @Override
    public Dough createDough() {
        return new ThickCrustDough();
    }

    @Override
    public Sauce createSauce() {
        return new PlumTomatoSauce();
    }

    @Override
    public Cheese createCheese() {
        return new MozarellaChesse();
    }

    @Override
    public Veggies[] createVeggies() {
        Veggies[] veggies = {new BlackOlives(), new Spinach(), new EggPlant()};
        return veggies;
    }

    @Override
    public Pepperoni createPepperoni() {
        return new SlicedPepperoni();
    }

    @Override
    public Clams createClam() {
        return new FrozenClam();
    }
}
