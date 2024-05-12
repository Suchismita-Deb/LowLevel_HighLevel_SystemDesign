package org.example.DesignPattern.BehavoiralDesignPattern.ObserverDesignPattern.Example1.BetterCode.Observable;

import May.SpringCourse.DesignPattern.BehavoiralDesignPattern.ObserverDesignPattern.Example1.BetterCode.Observer.DisplayObserver;

import java.util.ArrayList;
import java.util.List;

public class WeatherStationObservableImpl implements WeatherStationObservable{
    List<DisplayObserver> displayObserverList = new ArrayList<>();
    int currTemp = 0;
    @Override
    public void add(DisplayObserver obj) {
        displayObserverList.add(obj);
    }

    @Override
    public void remove(DisplayObserver obj) {
        displayObserverList.remove(obj);
    }

    @Override
    public void notifySubscriber() {
        for(DisplayObserver o:displayObserverList){
            o.update();
        }
    }

    @Override
    public void setTemp(int newTemp) {
        if(currTemp!=newTemp){
            currTemp=newTemp;
            notifySubscriber();
        }
    }

    @Override
    public int getTemp() {
        return currTemp;
    }
}
