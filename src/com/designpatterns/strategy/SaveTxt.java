package com.designpatterns.strategy;


import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.List;
import java.util.ListIterator;

public class SaveTxt implements SaveInterface {

    @Override
    public boolean saveSortData(List<Integer> list) {

        try {
            PrintWriter out = new PrintWriter("output.txt");
            for (ListIterator<Integer> it = list.listIterator(); it.hasNext(); ) {
                int val = it.next();
                out.print(val + " ");

            }
            out.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            return false;
        }

        return true;
    }
}