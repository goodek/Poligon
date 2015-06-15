package pl.bartoszjanik.poligon.hfdp.factorypattern.pizzas;

import pl.bartoszjanik.poligon.hfdp.factorypattern.ingredients.PizzaIngredientFactory;

/**
 * Created by Bartosz Janik on 2015-06-12.
 */
public class CheesePizza extends Pizza {
    PizzaIngredientFactory ingredientFactory;

    public CheesePizza(PizzaIngredientFactory pizzaIngredientFactory) {
        this.ingredientFactory = pizzaIngredientFactory;
    }

    public void prepare() {
        System.out.println("Preparing " + name);
        dough = ingredientFactory.createDough();
        sauce = ingredientFactory.createSauce();
        cheese = ingredientFactory.createCheese();
    }
}
