package pl.bartoszjanik.poligon.hfdp.weatherdata;

/**
 * Created by bjanik on 2015-06-10.
 */

public interface SubjectLocal {
    void registerObserver(ObserverLocal observer);

    void removeObserver(ObserverLocal observer);

    void notifyObservers();
}
