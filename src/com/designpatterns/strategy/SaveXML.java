package com.designpatterns.strategy;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.List;
import java.util.ListIterator;

/**
 * Created by Filip on 30.03.2017.
 */
public class SaveXML implements SaveInterface {

    @Override
    public boolean saveSortData(List<Integer> list) {

        try {
            PrintWriter out = new PrintWriter("output.txt");
            for (ListIterator<Integer> it = list.listIterator(); it.hasNext(); ) {
                int val = it.next();
                out.print("<value>");
                out.print(val);
                out.print("</value>\n");
            }
            out.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            return false;
        }

        return true;
    }
}