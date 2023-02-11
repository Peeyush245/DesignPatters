package org.example;

public class CurrentWeatherConditionsDisplay implements Observer{
    private int temperature;
    private int humidity;
    public CurrentWeatherConditionsDisplay(Observable observable) {
        observable.registerObserver(this);
    }

    @Override
    public void update(int temperature, int humidity) {
        this.temperature = temperature;
        this.humidity = humidity;
        display();
    }

    public void display() {
        System.out.println("Current Weather Condition");
        System.out.println("Temperature : " + temperature);
        System.out.println("Humidity : " + humidity);
    }
}
