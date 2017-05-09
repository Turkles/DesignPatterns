package com.designpatterns.observer_visitor_iterator.interfaces;

/**
 * Created by Filip on 08.05.2017.
 */
public interface Termometer {
    void addTemperatureObserver(TemperatureObserver to);
    float getTemperature();
}
