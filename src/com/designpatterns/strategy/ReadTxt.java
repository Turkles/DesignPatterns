package com.designpatterns.strategy;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Created by Filip on 30.03.2017.
 */
public class ReadTxt implements ReadInterface {

    @Override
    public List<Integer> readNumbers(String fileName) {

        // read data from file using Scanner
        File file = new File(fileName);
        List<Integer> tempList = new ArrayList<>();
        try {
            Scanner in = new Scanner(file);     // add
            while (in.hasNextLine()) {
                tempList.add(in.nextInt());
            }
            in.close();
        }
        catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        return tempList;
    }
}