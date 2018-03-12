/**
 * @author RZD
 * @date 2018/3/12
 */
interface Observer {
    public void update();
}

interface DisplayElement {
    public void display();
}

class CurrentConditionDisplay implements Observer, DisplayElement {
    public CurrentConditionDisplay(WeatherData weatherData) {
        this.weatherData = weatherData;
        this.weatherData.registerObserver(this);
    }

    @Override
    public void display() {
        System.out.println("Current conditions: " + temperature +
                "F degrees and " + humidity + "% humidity");
    }

    @Override
    public void update() {
        temperature = weatherData.getTemperature();
        humidity = weatherData.getHumidity();
        display();
    }

    private final WeatherData weatherData;
    private float temperature;
    private float humidity;
}
