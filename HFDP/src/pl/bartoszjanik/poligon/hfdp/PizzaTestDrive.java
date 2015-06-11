package pl.bartoszjanik.poligon.hfdp;

import pl.bartoszjanik.poligon.hfdp.pizza.pizzas.Pizza;
import pl.bartoszjanik.poligon.hfdp.pizza.stores.ChicagoStylePizzaStore;
import pl.bartoszjanik.poligon.hfdp.pizza.stores.NYStylePizzaStore;
import pl.bartoszjanik.poligon.hfdp.pizza.stores.PizzaStore;

/**
 * Created by Bartosz Janik on 2015-06-11.
 */
public class PizzaTestDrive {
    public static void main(String[] args) {
        PizzaStore nyStore = new NYStylePizzaStore();
        PizzaStore chicagoStore = new ChicagoStylePizzaStore();

        Pizza nyPizza = nyStore.orderPizza("cheese");
        Pizza chicagoPizza = chicagoStore.orderPizza("cheese");

        System.out.println(nyPizza.getName() + " delivered");
        System.out.println(chicagoPizza.getName() + " delivered");
    }
}
