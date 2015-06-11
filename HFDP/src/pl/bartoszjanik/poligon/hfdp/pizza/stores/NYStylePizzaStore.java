package pl.bartoszjanik.poligon.hfdp.pizza.stores;

import pl.bartoszjanik.poligon.hfdp.pizza.pizzas.*;

/**
 * Created by Bartosz Janik on 2015-06-11.
 */
public class NYStylePizzaStore extends PizzaStore {

    @Override
    protected Pizza createPizza(String type) {
        Pizza pizza = null;
        if (type.equals("cheese")) {
            pizza = new NYCheesePizza();
        } else if (type.equals("pepperoni")) {
            pizza = new NYPepeperoniPizza();
        } else if (type.equals("clam")) {
            pizza = new NYClamPizza();
        } else if (type.equals("veggie")) {
            pizza = new NYVeggiePizza();
        }
        return pizza;
    }
}
