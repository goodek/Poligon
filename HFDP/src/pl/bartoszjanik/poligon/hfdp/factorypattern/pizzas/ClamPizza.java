package pl.bartoszjanik.poligon.hfdp.factorypattern.pizzas;

import pl.bartoszjanik.poligon.hfdp.factorypattern.ingredients.PizzaIngredientFactory;

/**
 * Created by Bartosz Janik on 2015-06-12.
 */
public class ClamPizza extends Pizza {

    private PizzaIngredientFactory ingredientFactory;

    public ClamPizza(PizzaIngredientFactory ingredientFactory) {
        this.ingredientFactory = ingredientFactory;
    }

    @Override
    public void prepare() {
        System.out.println("Preparing " + name);
        dough = ingredientFactory.createDough();
        sauce = ingredientFactory.createSauce();
        cheese = ingredientFactory.createCheese();
        clams = ingredientFactory.createClam();
    }
}
