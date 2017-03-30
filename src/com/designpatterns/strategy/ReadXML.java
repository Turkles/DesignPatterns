package com.designpatterns.strategy;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Created by Filip on 30.03.2017.
 */
public class ReadXML implements ReadInterface {

    @Override
    public List<Integer> readNumbers(String fileName) {

        File file = new File(fileName);
        List<Integer> tempList = new ArrayList<>();
        try {
            Scanner in = new Scanner(file);
            while (in.hasNextLine()) {
                String line = in.nextLine();
                line = line.replace("<value>","");
                line = line.replace("</value>","");
                line = line.replaceAll("\\s+","");

                int temp = Integer.parseInt(line);
                tempList.add(temp);
            }
            in.close();

        }
        catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        return tempList;
    }
}
