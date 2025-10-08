package DesignPatterns.ObserverPattern.WeatherStation;

import DesignPatterns.ObserverPattern.WeatherStation.Observable.WeatherStationImpl;
import DesignPatterns.ObserverPattern.WeatherStation.Observers.MobileDisplay;
import DesignPatterns.ObserverPattern.WeatherStation.Observers.TvDisplay;

public class WorkStation {

    public static void main(String[] args) {
        WeatherStationImpl weatherStation = new WeatherStationImpl();
        TvDisplay tvObserver = new TvDisplay(weatherStation);
        MobileDisplay mobileObserver = new MobileDisplay(weatherStation);

        weatherStation.add(tvObserver);
        weatherStation.add(mobileObserver);

        weatherStation.setData(45);
        weatherStation.setData(55);
        weatherStation.setData(55);
    }
}
