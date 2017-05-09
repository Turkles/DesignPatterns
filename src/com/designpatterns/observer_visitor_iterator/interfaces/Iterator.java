package com.designpatterns.observer_visitor_iterator.interfaces;

/**
 * Created by Filip on 09.05.2017.
 */
public interface Iterator {

    TestableDetector next();
    TestableDetector currentItem();
    boolean hasNext();
}
