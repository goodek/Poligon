package pl.bartoszjanik.poligon.hfdp.weatherdata;

/**
 * Created by bjanik on 2015-06-10.
 */
public class CurrentConditionDisplay implements Observer, DisplayElement {

    private float temperature;
    private float humidity;
    private Subject weatherData;

    public CurrentConditionDisplay(Subject weatherData) {
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }

    @Override
    public void display() {
        System.out.println(String.format("Current conditions: %.2f degrees, %.2f %% humidity", temperature, humidity));
    }

    @Override
    public void update(float temp, float humidity, float pressure) {
        this.temperature = temp;
        this.humidity = humidity;
        display();
    }
}
