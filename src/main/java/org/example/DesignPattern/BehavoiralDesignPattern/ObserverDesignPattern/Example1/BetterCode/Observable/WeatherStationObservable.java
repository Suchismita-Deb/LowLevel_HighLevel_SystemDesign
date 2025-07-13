package org.example.DesignPattern.BehavoiralDesignPattern.ObserverDesignPattern.Example1.BetterCode.Observable;


import org.example.DesignPattern.BehavoiralDesignPattern.ObserverDesignPattern.Example1.BetterCode.Observer.DisplayObserver;

public interface WeatherStationObservable {
    void add(DisplayObserver obj);
    void remove(DisplayObserver obj);
    void notifySubscriber();
    void setTemp(int temp);
    int getTemp();
}
