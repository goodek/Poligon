package pl.bartoszjanik.poligon.hfdp;

import pl.bartoszjanik.poligon.hfdp.factorypattern.pizzas.Pizza;
import pl.bartoszjanik.poligon.hfdp.factorypattern.stores.ChicagoStylePizzaStore;
import pl.bartoszjanik.poligon.hfdp.factorypattern.stores.NYStylePizzaStore;
import pl.bartoszjanik.poligon.hfdp.factorypattern.stores.PizzaStore;

/**
 * Created by Bartosz Janik on 2015-06-11.
 */
public class PizzaTestDrive {
    public static void main(String[] args) {
        PizzaStore nyStore = new NYStylePizzaStore();
        PizzaStore chicagoStore = new ChicagoStylePizzaStore();

        Pizza nyPizza = nyStore.orderPizza("cheese");
        System.out.println(nyPizza.getName() + " delivered");
        System.out.println(nyPizza.toString());

        nyPizza = nyStore.orderPizza("veggie");
        System.out.println(nyPizza.getName() + " delivered");
        System.out.println(nyPizza.toString());

        nyPizza = nyStore.orderPizza("clam");
        System.out.println(nyPizza.getName() + " delivered");
        System.out.println(nyPizza.toString());

        Pizza chicagoPizza = chicagoStore.orderPizza("cheese");
        System.out.println(chicagoPizza.getName() + " delivered");
        System.out.println(chicagoPizza.toString());
    }
}
