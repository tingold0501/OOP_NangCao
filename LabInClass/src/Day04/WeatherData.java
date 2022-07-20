package Day04;

public class WeatherData {
    float temperature;
    float humidity;
    float pressure;

    public float getTemperature() {
        return temperature;
    }

    public void setTemperature(float temperature) {
        this.temperature = temperature;
    }

    public float getHumidity() {
        return humidity;
    }

    public void setHumidity(float humidity) {
        this.humidity = humidity;
    }

    public float getPressure() {
        return pressure;
    }

    public void setPressure(float pressure) {
        this.pressure = pressure;
    }

    public void measuremantsChanged() {
        float temp = getTemperature();
        float humidity = getHumidity();
        float pressure = getPressure();
    }

    // currentConditionsDisplay.update(temp, humidity,pressure);
    // statisticsDisplay.update(temp,humidity,pressure);
    // forecastDisplay.update(temp,humidity,pressure);
}
