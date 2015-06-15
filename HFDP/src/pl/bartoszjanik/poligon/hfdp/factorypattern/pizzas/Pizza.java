package pl.bartoszjanik.poligon.hfdp.factorypattern.pizzas;

import pl.bartoszjanik.poligon.hfdp.factorypattern.ingredients.cheese.Cheese;
import pl.bartoszjanik.poligon.hfdp.factorypattern.ingredients.clams.Clams;
import pl.bartoszjanik.poligon.hfdp.factorypattern.ingredients.dough.Dough;
import pl.bartoszjanik.poligon.hfdp.factorypattern.ingredients.pepperoni.Pepperoni;
import pl.bartoszjanik.poligon.hfdp.factorypattern.ingredients.sauce.Sauce;
import pl.bartoszjanik.poligon.hfdp.factorypattern.ingredients.veggies.Veggies;

/**
 * Created by bjanik on 2015-06-11.
 */
public abstract class Pizza {

    protected String name;
    protected Dough dough;
    protected Sauce sauce;
    protected Cheese cheese;
    protected Pepperoni pepperoni;
    protected Clams clams;
    protected Veggies[] veggies;

    public abstract void prepare();

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

    public void setName(String name) {
        this.name = name;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(name).append(": \n\t").append(dough.getName()).append("\n\t").append(sauce.getName());
        sb.append("\n\t").append(cheese.getName()).append("\n\t");
        if (pepperoni != null) {
            sb.append(pepperoni.getName()).append("\n\t");
        }
        if (clams != null) {
            sb.append(clams.getName()).append("\n\t");
        }
        if (veggies != null) {
            sb.append("Veggies:").append("\n\t\t");
            for (int i = 0; i < veggies.length; i++) {
                sb.append(veggies[i].getName()).append("\n\t\t");
            }
        }
        return sb.toString();
    }
}
