package com.designpatterns.observer_visitor_iterator;

import com.designpatterns.observer_visitor_iterator.interfaces.Visitor;

/**
 * Created by Filip on 09.05.2017.
 */
public class FireAlarmVisitor implements Visitor {

    FireAlarm fireAlarm;

    public FireAlarmVisitor(FireAlarm fireAlarm) {
        this.fireAlarm = fireAlarm;
    }


    @Override
    public FireAlarm addFireAlarm() {
        return fireAlarm;
    }
}
