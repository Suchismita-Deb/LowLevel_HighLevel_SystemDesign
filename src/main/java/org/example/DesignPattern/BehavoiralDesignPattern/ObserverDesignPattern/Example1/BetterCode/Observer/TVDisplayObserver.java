package org.example.DesignPattern.BehavoiralDesignPattern.ObserverDesignPattern.Example1.BetterCode.Observer;

import May.SpringCourse.DesignPattern.BehavoiralDesignPattern.ObserverDesignPattern.Example1.BetterCode.Observable.WeatherStationObservable;

public class TVDisplayObserver implements DisplayObserver{

    WeatherStationObservable weatherStationObservable;

    public TVDisplayObserver(WeatherStationObservable obj){
        this.weatherStationObservable = obj;
    }
    @Override
    public void update() {
        System.out.println(weatherStationObservable.getTemp());
    }
}
