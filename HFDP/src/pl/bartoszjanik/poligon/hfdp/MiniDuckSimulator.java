package pl.bartoszjanik.poligon.hfdp;

import pl.bartoszjanik.poligon.hfdp.ducks.Duck;
import pl.bartoszjanik.poligon.hfdp.ducks.MallardDuck;
import pl.bartoszjanik.poligon.hfdp.ducks.ModelDuck;
import pl.bartoszjanik.poligon.hfdp.ducks.behaviorsimpl.FlyRocketPowered;

/**
 * Created by bjanik on 2015-06-10.
 */
public class MiniDuckSimulator {

    public static void main(String[] args) {
        Duck mallard = new MallardDuck();
        mallard.display();
        mallard.performFly();
        mallard.performQuack();

        Duck model = new ModelDuck();
        model.display();
        model.performFly();
        model.performQuack();
        model.setFlyBehavior(new FlyRocketPowered());
        model.performFly();
    }
}
