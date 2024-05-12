package org.example.DesignPattern.BehavoiralDesignPattern.ObserverDesignPattern.Example1.BetterCode;

import May.SpringCourse.DesignPattern.BehavoiralDesignPattern.ObserverDesignPattern.Example1.BetterCode.Observable.WeatherStationObservable;
import May.SpringCourse.DesignPattern.BehavoiralDesignPattern.ObserverDesignPattern.Example1.BetterCode.Observable.WeatherStationObservableImpl;
import May.SpringCourse.DesignPattern.BehavoiralDesignPattern.ObserverDesignPattern.Example1.BetterCode.Observer.DisplayObserver;
import May.SpringCourse.DesignPattern.BehavoiralDesignPattern.ObserverDesignPattern.Example1.BetterCode.Observer.MobileDisplayObserver;
import May.SpringCourse.DesignPattern.BehavoiralDesignPattern.ObserverDesignPattern.Example1.BetterCode.Observer.TVDisplayObserver;

public class Main {
    public static void main(String[] args) {
        WeatherStationObservable weatherStationObservable = new WeatherStationObservableImpl();
        DisplayObserver observer1 = new MobileDisplayObserver(weatherStationObservable);
        DisplayObserver observer2 = new MobileDisplayObserver(weatherStationObservable);
        DisplayObserver observer3 = new TVDisplayObserver(weatherStationObservable);

        weatherStationObservable.add(observer1);
        weatherStationObservable.add(observer2);
        weatherStationObservable.add(observer3);

        weatherStationObservable.setTemp(100);
        weatherStationObservable.getTemp();
    }
}
