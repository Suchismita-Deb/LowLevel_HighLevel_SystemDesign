package org.example.DesignPattern.BehavoiralDesignPattern.ObserverDesignPattern.Example1.BetterCode.Observer;

import May.SpringCourse.DesignPattern.BehavoiralDesignPattern.ObserverDesignPattern.Example1.BetterCode.Observable.WeatherStationObservable;

public class MobileDisplayObserver implements DisplayObserver {

    WeatherStationObservable weatherStationObservable;

    public MobileDisplayObserver(WeatherStationObservable obj){
        this.weatherStationObservable = obj;
    }

    @Override
    public void update() {
        System.out.println(weatherStationObservable.getTemp());
    }
}
