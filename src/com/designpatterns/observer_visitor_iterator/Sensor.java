package com.designpatterns.observer_visitor_iterator;

import com.designpatterns.observer_visitor_iterator.interfaces.Visitor;

/**
 * Created by Filip on 10.05.2017.
 */
public class Sensor {
    public MySmokeDetector smokeDetector;
    public MyTermometer termometer;

    public String name;

    public Sensor() {
        smokeDetector = new MySmokeDetector();
        termometer = new MyTermometer();

    }

    public void measure() {
        smokeDetector.checkSmoke();
        termometer.measureTemperature();
    }

    public void visitAll(Visitor visitor) {
        smokeDetector.acceptVisitor(visitor);
        termometer.acceptVisitor(visitor);
    }

}