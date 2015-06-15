package pl.bartoszjanik.poligon.hfdp.factorypattern.pizzas;

import pl.bartoszjanik.poligon.hfdp.factorypattern.ingredients.PizzaIngredientFactory;

/**
 * Created by Bartosz Janik on 2015-06-12.
 */
public class PepperoniPizza extends Pizza {

    private PizzaIngredientFactory ingredientFactory;

    public PepperoniPizza(PizzaIngredientFactory ingredientFactory) {
        this.ingredientFactory = ingredientFactory;
    }

    @Override
    public void prepare() {
        System.out.println("Preparing " + name);
        dough = ingredientFactory.createDough();
        sauce = ingredientFactory.createSauce();
        cheese = ingredientFactory.createCheese();
        pepperoni = ingredientFactory.createPepperoni();
    }
}
