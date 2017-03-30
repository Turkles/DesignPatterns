package com.designpatterns.strategy;

import java.util.Collections;
import java.util.List;

/**
 * Created by Filip on 30.03.2017.
 */
public class DefaultSort implements SortInterface{

    @Override
    public List<Integer> sortList(List<Integer> list) {
        Collections.sort(list);
        return list;
    }
}
