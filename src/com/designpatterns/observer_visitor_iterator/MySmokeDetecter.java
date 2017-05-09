package com.designpatterns.observer_visitor_iterator;

import com.designpatterns.observer_visitor_iterator.interfaces.SmokeDetector;
import com.designpatterns.observer_visitor_iterator.interfaces.SmokeObserver;
import com.designpatterns.observer_visitor_iterator.interfaces.TestableDetector;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class MySmokeDetecter implements SmokeDetector, TestableDetector {

    List<SmokeObserver> observers = new ArrayList<SmokeObserver>();

    boolean smokeDetect = false;

    public void setSmokeboolean ( boolean smokeDetect) {
        this.smokeDetect = smokeDetect;
    }

    @Override
    public boolean hasSmokeBeenDetected() {

        Random random = new Random();
        return random.nextBoolean();

        //return smokeDetect;
    }

    @Override
    public void addSmokeObserver(SmokeObserver so) {
        observers.add(so);
    }

    public void checkSmoke(){
        boolean stateSmoke = hasSmokeBeenDetected();
        if( stateSmoke != smokeDetect ){
            for (SmokeObserver so : observers){
                so.smokeChange();
            }
        }
    }

    @Override
    public boolean test() {
        System.out.println("Im MySmokeDetecter class");
        return false;
    }
}
