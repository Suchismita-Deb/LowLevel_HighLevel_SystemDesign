package org.example.DesignPattern.BehavoiralDesignPattern.ObserverDesignPattern.Example1.BetterCode;

import java.util.ArrayList;
import java.util.List;

interface Observer {
    void update(float temperature);
}

class MobileObserver implements Observer {
    @Override
    public void update(float temperature) {
        System.out.println("Temp in mobile "+temperature);
    }
}

class TvObserver implements Observer {
    @Override
    public void update(float temperature) {
        System.out.println("Temp in Tv "+temperature);
    }
}

interface Subject {
    void addObserver(Observer observer);

    void deleteObserver(Observer observer);

    void notifyObservers(float temperature);
}

class WeatherStationSubject implements Subject {
    private float temperature;
    List<Observer> observer;

    public WeatherStationSubject() {
        observer = new ArrayList<>();
    }
    public void addObserver(Observer observer) {
        this.observer.add(observer);
    }

    public void setTemperature(float temperature) {
        this.temperature = temperature;
        notifyObservers(temperature);
    }
    public void deleteObserver(Observer observer) {
        this.observer.remove(observer);
    }

    public void notifyObservers(float temperature) {
        for (Observer observer : this.observer) {
            observer.update(temperature);
        }
    }
}

public class ObserverPatternMain {
    public static void main(String[] args) {
        WeatherStationSubject weatherStationSubject = new WeatherStationSubject();
        MobileObserver mobileObserver = new MobileObserver();
        TvObserver tvObserver = new TvObserver();
        weatherStationSubject.addObserver(mobileObserver);
        weatherStationSubject.addObserver(tvObserver);
        weatherStationSubject.setTemperature(25);
        weatherStationSubject.deleteObserver(mobileObserver);
        weatherStationSubject.setTemperature(30);
    }
}