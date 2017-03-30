package com.designpatterns.strategy;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.*;

interface SortInterface {
    List<Integer> sortList (List<Integer> list);
}

interface ReadInterface {
    List<Integer> readNumbers ( String fileName);
}

interface SaveInterface {
    boolean saveSortData (List<Integer> list);
}

class ReadTxt implements ReadInterface {

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

class ReadXML implements ReadInterface {

    @Override
    public List<Integer> readNumbers( String fileName) {

        File file = new File(fileName);
        List<Integer> tempList = new ArrayList<>();
        try {
            Scanner in = new Scanner(file);
            while (in.hasNextLine()) {
                String line = in.nextLine();
                line.replace("<value>","");
                line.replace("</value>","");
                tempList.add(Integer.parseInt(line));
            }
            in.close();
        }
        catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        return tempList;
    }
}

class DefaultSort implements SortInterface{

    @Override
    public List<Integer> sortList(List<Integer> list) {
        Collections.sort(list);
        return list;
    }
}

class InsertionSort implements SortInterface {

    @Override
    public List<Integer> sortList(List<Integer> list) {

        Integer [] array = new Integer[list.size()];
        array = list.toArray(array);

        Integer k = 0;
        for (int i = 2; i < list.size(); ++i) {
            k = array[i];
            int j = i - 1;
            while (j >= 0 && array[j] > k) {
                array[j + 1] = array[j];
                j = j - 1;
            }
            array[j + 1] = k;
        }
        list = Arrays.asList(array);
        return list;
    }
}

class SaveNormal implements SaveInterface {

    @Override
    public boolean saveSortData(List<Integer> list) {

        try {
            PrintWriter out = new PrintWriter("output.txt");
            for (ListIterator<Integer> it = list.listIterator(); it.hasNext();) {
                out.print(it.next());
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            return false;
        }

        return true;
    }
}


public class Strategy{

    private SortInterface sort;
    private ReadInterface read;
    private SaveInterface save;

    public void setRead(ReadInterface read) {
        this.read = read;
    }

    public void setSort(SortInterface sort) {
        this.sort = sort;
    }

    public void setSave(SaveInterface save) {
        this.save = save;
    }

    public void doTheJob (String Path){

        try {
            List<Integer> tempList = read.readNumbers(Path);
            sort.sortList(tempList);
            save.saveSortData(tempList);
        } catch (NullPointerException e){
            System.out.println("Error "+e);
        }
    }
}
