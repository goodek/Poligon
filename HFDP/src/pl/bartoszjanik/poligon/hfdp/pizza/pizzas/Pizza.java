package pl.bartoszjanik.poligon.hfdp.pizza.pizzas;

import java.util.ArrayList;

/**
 * Created by bjanik on 2015-06-11.
 */
public abstract class Pizza {

    protected String name;
    protected String dough;
    protected String sauce;
    protected ArrayList<String> toppings = new ArrayList();

    public void prepare() {
        System.out.println("Preparing " + name);
        System.out.println("Tossing " + dough + "...");
        System.out.println("Adding " + sauce + "...");
        System.out.println("Adding toppings:");
        for (int i = 0; i < toppings.size(); i++) {
            System.out.println("    " + toppings.get(i));
        }
    }

    public void bake() {
        System.out.println("Abstract bake");
    }

    public void cut() {
        System.out.println("Abstract cut");
    }

    public void box() {
        System.out.println("Abstract box");
    }

    public String getName(){
        return name;
    }
}
