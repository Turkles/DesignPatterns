package com.designpatterns.observer_visitor_iterator;

import com.designpatterns.observer_visitor_iterator.interfaces.Iterator;
import com.designpatterns.observer_visitor_iterator.interfaces.TestableDetector;

import java.util.List;

/**
 * Created by Filip on 09.05.2017.
 */
public class SensorsIterator implements Iterator{

    TestableDetector[] sensorList;
    int iter;

    public SensorsIterator(TestableDetector [] sensorList) {
        this.sensorList = sensorList;
        iter = 0;
    }

    public TestableDetector next(){
        return sensorList[iter++];
    }


    @Override
    public TestableDetector currentItem() {
        return sensorList[iter];
    }

    public boolean hasNext(){
        if( iter+1 >= sensorList.length ){
            return false;
        }
        return true;
    }
}
