package com.example.prakt49.observer;

import java.util.ArrayList;
import java.util.List;

public class DataSubject implements Subject {
    private List<Observer> observers = new ArrayList<>();
    private String data;

    @Override
    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for (Observer observer : observers) {
            observer.update(data);
        }
    }

    @Override
    public void setData(String data) {
        this.data = data;
        notifyObservers();
    }
}
