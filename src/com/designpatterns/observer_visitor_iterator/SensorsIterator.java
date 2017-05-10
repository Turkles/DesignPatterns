package com.designpatterns.observer_visitor_iterator;

import com.designpatterns.observer_visitor_iterator.interfaces.Iterator;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Filip on 09.05.2017.
 */
public class SensorsIterator implements Iterator {

    List<Sensor> sensors = new ArrayList<Sensor>();
    int i;
    public SensorsIterator(List<Sensor> sensors) {
        this.sensors = sensors;
        i = 0;
    }

    @Override
    public Sensor next() {
        return sensors.get(++i);
    }

    @Override
    public Sensor currentItem() {
        return sensors.get(i);
    }

    @Override
    public boolean hasNext() {
        if( i >= sensors.size() ) {
            return false;
        }
        return true;
    }
}
