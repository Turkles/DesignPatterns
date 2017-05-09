package com.designpatterns.observer_visitor_iterator.interfaces;

import com.designpatterns.observer_visitor_iterator.FireAlarm;

/**
 * Created by Filip on 09.05.2017.
 */
public class FireAlarmVisitator implements Visitator {

    @Override
    public void vist(Termometer termometer, FireAlarm fireAlarm) {
        termometer.addTemperatureObserver(fireAlarm);
    }

    @Override
    public void vist(SmokeDetector smokeDetector, FireAlarm fireAlarm) {
        smokeDetector.addSmokeObserver(fireAlarm);
    }
}
