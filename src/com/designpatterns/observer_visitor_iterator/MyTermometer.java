package com.designpatterns.observer_visitor_iterator;

import com.designpatterns.observer_visitor_iterator.interfaces.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * Created by Filip on 08.05.2017.
 */
public class MyTermometer implements Termometer, TestableDetector, Visitable {
    List<TemperatureObserver> observers = new ArrayList<TemperatureObserver>();

    float previousTemperature =0;
    float temperature=0;

    @Override
    public void addTemperatureObserver(TemperatureObserver to) {

        observers.add(to);
    }

    public void setPreviousTemperature(float temperature) {
        this.temperature = temperature;
    }

    @Override
    public float getTemperature() {

        Random random = new Random();
        temperature = random.nextInt(30 ) +17 ; // between 17 - 46

        return temperature;
    }

    public void measureTemperature(){
        float temperature = getTemperature();
        if( temperature != previousTemperature ){
            for (TemperatureObserver o : observers){
                o.temperatureChange(temperature);
            }
        }
    }

    @Override
    public boolean test() {
        System.out.println("Im MyTermometr class");
        return false;
    }


    @Override
    public void acceptVisitor( Visitor visitor ) {
        addTemperatureObserver(visitor.addFireAlarm());
    }
}
