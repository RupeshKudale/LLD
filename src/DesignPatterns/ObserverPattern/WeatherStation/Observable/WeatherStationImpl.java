package DesignPatterns.ObserverPattern.WeatherStation.Observable;

import DesignPatterns.ObserverPattern.WeatherStation.Observers.DisplayObserver;

import java.util.ArrayList;
import java.util.List;

public class WeatherStationImpl implements WorkStationObservable {
    private float temp = 34;
    private final List<DisplayObserver> observers = new ArrayList<>();
    @Override
    public void add(DisplayObserver displayObserver) {
        observers.add(displayObserver);
    }

    @Override
    public void remove(DisplayObserver displayObserver) {
        observers.remove(displayObserver);
    }

    @Override
    public void notifyObservers() {
        for(DisplayObserver observer: observers) {
            observer.update();
        }
    }

    @Override
    public void setData(float temp) {
        if(this.temp != temp) {
            this.temp = temp;
            notifyObservers();
        }
    }

    @Override
    public float getData() {
        return this.temp;
    }
}
