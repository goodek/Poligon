package pl.bartoszjanik.poligon.hfdp;

import pl.bartoszjanik.poligon.hfdp.starbuzz.Beverage;
import pl.bartoszjanik.poligon.hfdp.starbuzz.beverages.DarkRoast;
import pl.bartoszjanik.poligon.hfdp.starbuzz.beverages.Espresso;
import pl.bartoszjanik.poligon.hfdp.starbuzz.beverages.HouseBlend;
import pl.bartoszjanik.poligon.hfdp.starbuzz.condiments.Milk;
import pl.bartoszjanik.poligon.hfdp.starbuzz.condiments.Mocha;
import pl.bartoszjanik.poligon.hfdp.starbuzz.condiments.Soy;
import pl.bartoszjanik.poligon.hfdp.starbuzz.condiments.Whip;

/**
 * Created by bjanik on 2015-06-11.
 */
public class StarbuzzCoffee {

    public static void main(String args[]) {
        Beverage beverage = new Espresso();
        printBeverage(beverage);
        beverage = new Milk(beverage);
        printBeverage(beverage);

        Beverage beverage1 = new DarkRoast();
        beverage1 = new Mocha(beverage1);
        beverage1 = new Mocha(beverage1);
        beverage1 = new Whip(beverage1);
        printBeverage(beverage1);

        Beverage beverage2 = new HouseBlend();
        beverage2 = new Soy(beverage2);
        beverage2 = new Mocha(beverage2);
        beverage2 = new Whip(beverage2);
        printBeverage(beverage2);

    }

    public static void printBeverage(Beverage beverage) {
        System.out.println(String.format("%s $%.2f", beverage.getDescription(), beverage.cost()));
    }
}
