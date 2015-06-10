package pl.bartoszjanik.poligon.hfdp.weatherdata;

/**
 * Created by bjanik on 2015-06-10.
 */

public interface Subject {
    void registerObserver(Observer observer);

    void removeObserver(Observer observer);

    void notifyObservers();
}
