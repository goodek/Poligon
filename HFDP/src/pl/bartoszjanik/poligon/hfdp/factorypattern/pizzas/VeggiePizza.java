package pl.bartoszjanik.poligon.hfdp.factorypattern.pizzas;

import pl.bartoszjanik.poligon.hfdp.factorypattern.ingredients.PizzaIngredientFactory;

/**
 * Created by Bartosz Janik on 2015-06-12.
 */
public class VeggiePizza extends Pizza {

    private final PizzaIngredientFactory ingredientFactory;

    public VeggiePizza(PizzaIngredientFactory ingredientFactory) {
        this.ingredientFactory = ingredientFactory;
    }


    @Override
    public void prepare() {
        System.out.println("Preparing " + name);
        dough = ingredientFactory.createDough();
        sauce = ingredientFactory.createSauce();
        cheese = ingredientFactory.createCheese();
        veggies = ingredientFactory.createVeggies();
    }
}
