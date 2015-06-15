package pl.bartoszjanik.poligon.hfdp.factorypattern.stores;

import pl.bartoszjanik.poligon.hfdp.factorypattern.ingredients.ChicagoIngredientFactory;
import pl.bartoszjanik.poligon.hfdp.factorypattern.ingredients.PizzaIngredientFactory;
import pl.bartoszjanik.poligon.hfdp.factorypattern.pizzas.*;

/**
 * Created by Bartosz Janik on 2015-06-11.
 */
public class ChicagoStylePizzaStore extends PizzaStore {
    @Override
    protected Pizza createPizza(String type) {
        Pizza pizza = null;
        PizzaIngredientFactory ingredientFactory = new ChicagoIngredientFactory();

        if (type.equals("cheese")) {
            pizza = new CheesePizza(ingredientFactory);
            pizza.setName("Chicago cheese pizza");
        } else if (type.equals("pepperoni")) {
            pizza = new PepperoniPizza(ingredientFactory);
            pizza.setName("Chicago pepperoni pizza");
        } else if (type.equals("clam")) {
            pizza = new ClamPizza(ingredientFactory);
            pizza.setName("Chicago clam pizza");
        } else if (type.equals("veggie")) {
            pizza = new VeggiePizza(ingredientFactory);
            pizza.setName("Chicago veggie pizza");
        }
        return pizza;
    }
}
