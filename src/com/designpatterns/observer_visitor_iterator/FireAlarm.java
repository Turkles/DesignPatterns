package com.designpatterns.observer_visitor_iterator;

import com.designpatterns.observer_visitor_iterator.interfaces.SmokeObserver;
import com.designpatterns.observer_visitor_iterator.interfaces.TemperatureObserver;

/**
 * Created by Filip on 08.05.2017.
 */
public class FireAlarm implements TemperatureObserver, SmokeObserver {

    @Override
    public void smokeChange() {
        System.out.println("Smoke Detected!!!");
    }

    @Override
    public void temperatureChange(float t) {
        if( t > 25 ){

            System.out.println("Temperature > 25 Detected!");
        }
    }
}
