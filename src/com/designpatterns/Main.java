package com.designpatterns;

import com.designpatterns.fasade.Fasade;
import com.designpatterns.strategy.*;


import java.util.Scanner;

public class Main {

    static Fasade Fan; // for fasade
    static Strategy ReadSortSave;
    public static void main (String [] args ){

        //exampleOfFasade();

        exampleOfStrategy();
    }

    public static void exampleOfFasade(){
        Fan = new Fasade();
        Fan.turnON();
        Fan.turnOFF();
    }

    public static void exampleOfStrategy(){
        ReadSortSave = new Strategy();
        Scanner in = new Scanner(System.in);

        System.out.println("What file do you want to read? 0 - txt, 1 - 'XML'");
        int q = in.nextInt();
        if( q == 0){ ReadSortSave.setRead(new ReadTxt()); }
        if( q == 1){ ReadSortSave.setRead(new ReadXML()); }

        System.out.println("What kind sort do you want to use? 0 - default Java sort, 1 - InsertionSort");
        q = in.nextInt();
        if( q == 0){ ReadSortSave.setSort(new DefaultSort()); }
        if( q == 1){ ReadSortSave.setSort(new InsertionSort()); }

        System.out.println("Which type of file? 0 - txt, 1 - 'XML'");
        q = in.nextInt();
        if( q == 0){ ReadSortSave.setSave(new SaveTxt()); }
        if( q == 1){ ReadSortSave.setSave(new SaveXML()); }

        ReadSortSave.doTheJob("in.txt");
    }
}

