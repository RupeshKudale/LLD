package DesignPatterns.ObserverPattern.WeatherStation.Observable;

import DesignPatterns.ObserverPattern.WeatherStation.Observers.DisplayObserver;

public interface WorkStationObservable {
     void add(DisplayObserver displayObserver);
     void remove(DisplayObserver displayObserver);
     void notifyObservers();
     void setData(float temp);
     float getData();

}
