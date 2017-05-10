package com.designpatterns.observer_visitor_iterator;

import com.designpatterns.observer_visitor_iterator.interfaces.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class MySmokeDetector implements SmokeDetector, TestableDetector, Visitable {

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

    @Override
    public void acceptVisitor( Visitor visitor ) {
        addSmokeObserver(visitor.addFireAlarm());
    }
}
