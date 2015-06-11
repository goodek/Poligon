package pl.bartoszjanik.poligon.hfdp.pizza.stores;

import pl.bartoszjanik.poligon.hfdp.pizza.pizzas.*;

/**
 * Created by Bartosz Janik on 2015-06-11.
 */
public class CaliforniaStylePizzaStore extends PizzaStore {

    @Override
    protected Pizza createPizza(String type) {
        Pizza pizza = null;
        if (type.equals("cheese")) {
            pizza = new CaliforniaCheesePizza();
        } else if (type.equals("pepperoni")) {
            pizza = new CaliforniaPepeperoniPizza();
        } else if (type.equals("clam")) {
            pizza = new CaliforniaClamPizza();
        } else if (type.equals("veggie")) {
            pizza = new CaliforniaVeggiePizza();
        }
        return pizza;
    }
}
