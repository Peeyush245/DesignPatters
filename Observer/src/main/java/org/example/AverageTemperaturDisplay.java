package org.example;

public class AverageTemperaturDisplay implements Observer{
    private int sumOfTemperatures;
    private int totalTemperatures;

    public AverageTemperaturDisplay(Observable observable) {
        sumOfTemperatures = 0;
        totalTemperatures = 0;
        observable.registerObserver(this);
    }

    @Override
    public void update(int temperature, int humidity) {
        sumOfTemperatures+=temperature;
        totalTemperatures++;
        display();
    }

    public void display() {
        System.out.println("Average temperature for the past "+totalTemperatures+" records = " + ((double)sumOfTemperatures/totalTemperatures));
    }
}
