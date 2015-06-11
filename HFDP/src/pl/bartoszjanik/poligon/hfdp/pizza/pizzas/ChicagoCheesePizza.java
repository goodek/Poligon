package pl.bartoszjanik.poligon.hfdp.pizza.pizzas;

/**
 * Created by Bartosz Janik on 2015-06-11.
 */
public class ChicagoCheesePizza extends Pizza {

    public ChicagoCheesePizza() {
        name = "Chicago cheese";
        dough = "Extra thick crust dough";
        sauce = "Plum tomato sauce";

        toppings.add("Shredded mozarealla cheese");
    }

    public void cut() {
        System.out.println("Cutting the pizza into square slices");
    }
}
