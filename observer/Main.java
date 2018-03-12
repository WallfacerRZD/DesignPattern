/**
 * @author
 * @date
 */
public class Main {
    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();
        Observer currentConditionsDisplay1 = new CurrentConditionDisplay(weatherData);
        weatherData.setMeasurements(1.2f, 2.2f, 3.3f);
        weatherData.measurementsChanged();
    }
}
