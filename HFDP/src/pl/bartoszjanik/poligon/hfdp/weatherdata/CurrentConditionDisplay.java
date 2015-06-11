package pl.bartoszjanik.poligon.hfdp.weatherdata;

import java.util.Observable;
import java.util.Observer;

/**
 * Created by bjanik on 2015-06-10.
 */
public class CurrentConditionDisplay implements Observer, DisplayElement {

    private float temperature;
    private float humidity;
    private Observable weatherData;

    public CurrentConditionDisplay(Observable weatherData) {
        this.weatherData = weatherData;
        weatherData.addObserver(this);
    }

    @Override
    public void display() {
        System.out.println(String.format("Current conditions: %.2f degrees, %.2f %% humidity", temperature, humidity));
    }

    @Override
    public void update(Observable obs, Object arg) {
        if (obs instanceof WeatherData) {
            WeatherData wd = (WeatherData)obs;
            this.temperature = wd.getTemperature();
            this.humidity = wd.getHumidity();
            display();
        }
    }
}
