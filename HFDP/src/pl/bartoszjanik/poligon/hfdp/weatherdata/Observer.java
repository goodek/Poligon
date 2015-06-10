package pl.bartoszjanik.poligon.hfdp.weatherdata;

/**
 * Created by bjanik on 2015-06-10.
 */
public interface Observer {
    public void update(float temp, float humidity, float pressure);
}
