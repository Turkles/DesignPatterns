package com.designpatterns.observer_visitor_iterator.interfaces;

import com.designpatterns.observer_visitor_iterator.FireAlarm;

/**
 * Created by Filip on 09.05.2017.
 */
public interface Visitor {
    void vist(Termometer termometer, FireAlarm fireAlarm);
    void vist( SmokeDetector smokeDetector, FireAlarm fireAlarm);
}
