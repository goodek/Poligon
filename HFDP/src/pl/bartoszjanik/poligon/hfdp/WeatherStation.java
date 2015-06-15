package pl.bartoszjanik.poligon.hfdp;

import pl.bartoszjanik.poligon.hfdp.observerpattern.CurrentConditionDisplay;
import pl.bartoszjanik.poligon.hfdp.observerpattern.WeatherData;

/**
 * Created by bjanik on 2015-06-10.
 */
public class WeatherStation {
    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();
        CurrentConditionDisplay currentConditionDisplay = new CurrentConditionDisplay(weatherData);

        weatherData.setMeasurements(30, 50, 30);
        weatherData.setMeasurements(27, 60, 28);
        weatherData.setMeasurements(28, 57, 28);
    }
}
