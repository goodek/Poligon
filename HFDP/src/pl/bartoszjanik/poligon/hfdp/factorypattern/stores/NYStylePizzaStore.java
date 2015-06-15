package pl.bartoszjanik.poligon.hfdp.factorypattern.stores;

import pl.bartoszjanik.poligon.hfdp.factorypattern.ingredients.NYPizzaIngredientFactory;
import pl.bartoszjanik.poligon.hfdp.factorypattern.ingredients.PizzaIngredientFactory;
import pl.bartoszjanik.poligon.hfdp.factorypattern.pizzas.*;

/**
 * Created by Bartosz Janik on 2015-06-11.
 */
public class NYStylePizzaStore extends PizzaStore {

    @Override
    protected Pizza createPizza(String type) {
        Pizza pizza = null;
        PizzaIngredientFactory ingredientFactory = new NYPizzaIngredientFactory();

        if (type.equals("cheese")) {
            pizza = new CheesePizza(ingredientFactory);
            pizza.setName("New York Style Cheese Pizza");
        } else if (type.equals("pepperoni")) {
            pizza = new PepperoniPizza(ingredientFactory);
            pizza.setName("NYC Pepperoni Pizza");
        } else if (type.equals("clam")) {
            pizza = new ClamPizza(ingredientFactory);
            pizza.setName("NYC Clam Pizza");
        } else if (type.equals("veggie")) {
            pizza = new VeggiePizza(ingredientFactory);
            pizza.setName("NYC Veggie Pizza");
        }
        return pizza;
    }
}
