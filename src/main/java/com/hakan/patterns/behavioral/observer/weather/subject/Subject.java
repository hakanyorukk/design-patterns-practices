package com.hakan.patterns.behavioral.observer.weather.subject;

import com.hakan.patterns.behavioral.observer.weather.observer.Observer;

public interface Subject {
    public void registerObserver(Observer o);
    public void removeObserver(Observer o);
    public void notifyObservers();
}
