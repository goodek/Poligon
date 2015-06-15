package pl.bartoszjanik.poligon.hfdp.factorypattern.stores;

import pl.bartoszjanik.poligon.hfdp.factorypattern.pizzas.Pizza;

/**
 * Created by Bartosz Janik on 2015-06-11.
 */
public abstract class PizzaStore {

    public Pizza orderPizza(String type) {
        Pizza pizza = createPizza(type);

        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();

        return pizza;
    }

    protected abstract Pizza createPizza(String type);
}
