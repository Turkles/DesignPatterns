package com.designpatterns.strategy;

import java.util.Arrays;
import java.util.List;

/**
 * Created by Filip on 30.03.2017.
 */
public class InsertionSort  implements SortInterface{

    @Override
    public List<Integer> sortList(List<Integer> list) {

        Integer [] array = new Integer[list.size()];
        array = list.toArray(array);

        for (int i = 1; i < array.length; ++i) {
            int temp = array[i];
            int j;
            for(j = i - 1; j >= 0 && array[ j ] > temp; j-- )
                array[ j + 1 ] = array[ j ];

            array[j + 1] = temp;
        }

        list = Arrays.asList(array);
        return list;
    }
}