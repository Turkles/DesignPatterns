package com.designpatterns.observer_visitor_iterator;

import com.designpatterns.observer_visitor_iterator.interfaces.SmokeDetector;
import com.designpatterns.observer_visitor_iterator.interfaces.Termometer;
import com.designpatterns.observer_visitor_iterator.interfaces.Visitor;

/**
 * Created by Filip on 09.05.2017.
 */
public class FireAlarmVisitor implements Visitor {

    @Override
    public void vist(Termometer termometer, FireAlarm fireAlarm) {
        termometer.addTemperatureObserver(fireAlarm);
    }

    @Override
    public void vist(SmokeDetector smokeDetector, FireAlarm fireAlarm) {
        smokeDetector.addSmokeObserver(fireAlarm);
    }
}
