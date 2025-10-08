package DesignPatterns.ObserverPattern.WeatherStation.Observers;

import DesignPatterns.ObserverPattern.WeatherStation.Observable.WorkStationObservable;

public class MobileDisplay implements DisplayObserver{
    private final WorkStationObservable weatherStationObservable;

    public MobileDisplay(WorkStationObservable weatherStationObservable) {
        this.weatherStationObservable = weatherStationObservable;
    }

    @Override
    public void update() {
        System.out.println(this.weatherStationObservable.getData()+ "From Mobile Display");
    }
}
