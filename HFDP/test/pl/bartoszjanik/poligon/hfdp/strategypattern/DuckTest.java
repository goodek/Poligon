package pl.bartoszjanik.poligon.hfdp.strategypattern;

import org.junit.Test;

import static org.junit.Assert.assertNotNull;

/**
 * Created by bjanik on 2015-06-10.
 */

public class DuckTest {
    @Test
    public void createDuck() {
        Duck duck = new MallardDuck();

        assertNotNull("Nie ma kaczki", duck);
    }
}
