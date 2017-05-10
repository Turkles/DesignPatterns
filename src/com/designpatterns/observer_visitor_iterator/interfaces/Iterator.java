package com.designpatterns.observer_visitor_iterator.interfaces;

import com.designpatterns.observer_visitor_iterator.Sensor;

/**
 * Created by Filip on 09.05.2017.
 */
public interface Iterator {

    Sensor next();
    Sensor currentItem();
    boolean hasNext();
}
