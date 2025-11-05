package behavioural.observer;

import java.util.ArrayList;
import java.util.List;

public class WeatherStation implements Subject {
    private final List<Observer> observers = new ArrayList<>();
    private float temperature;
    private float humidity;


    @Override
    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for (Observer o : observers){
            o.update(temperature, humidity);
        }
    }

    public void setMeasurement(float temperature, float humidity){
        this.temperature = temperature;
        this.humidity = humidity;
        notifyObservers();
    }
}
