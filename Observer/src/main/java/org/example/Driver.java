package org.example;

public class Driver {
    private static void delay() {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        WeatherStation weatherStation = new WeatherStation();

        CurrentWeatherConditionsDisplay currentWeatherConditionsDisplay = new CurrentWeatherConditionsDisplay(weatherStation);

        AverageTemperaturDisplay averageTemperaturDisplay = new AverageTemperaturDisplay(weatherStation);

        weatherStation.parametersChanged(20, 10);
        delay();

        weatherStation.parametersChanged(10, 30);
        delay();

        weatherStation.parametersChanged(50, 60);
        delay();
    }
}
