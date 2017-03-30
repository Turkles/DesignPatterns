package com.designpatterns.strategy;
import java.util.*;

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
            tempList = sort.sortList(tempList);
            save.saveSortData(tempList);
        } catch (NullPointerException e){
            System.out.println("Error "+e);
        }
    }
}
