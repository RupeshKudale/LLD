package DesignPatterns.ObserverPattern.WeatherStation.Observers;

import DesignPatterns.ObserverPattern.WeatherStation.Observable.WorkStationObservable;

public class TvDisplay implements DisplayObserver{
    private final WorkStationObservable workStationObservable;

    public TvDisplay(WorkStationObservable workStationObservable) {
        this.workStationObservable = workStationObservable;
    }
    @Override
    public void update() {
        System.out.println(this.workStationObservable.getData()+"From TV Display");
    }
}
