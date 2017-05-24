package com.designpatterns;

import com.designpatterns.chain_of_responsibility.Cargo;
import com.designpatterns.chain_of_responsibility.CargoSenderAdrvisor;
import com.designpatterns.command_decorator.Editor;
import com.designpatterns.fasade.Fasade;
import com.designpatterns.observer_visitor_iterator.*;
import com.designpatterns.strategy.*;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    static Fasade Fan; // for fasade
    static Strategy ReadSortSave;
    public static void main (String [] args ){

        //exampleOfFasade();

        //exampleOfStrategy();

        //exampleOfObservatorIteratorVisitator();

        exampleOfChainOfResponsibility();
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

    public static void exampleOfCommandAndDecorator(){
        Editor myEditor = new Editor();

        /*
        Scanner in = new Scanner(file);     // add
        while (in.hasNextLine()) {
            tempList.add(in.nextInt());
        }
        in.close();
        */
    }

    public static void exampleOfObservatorIteratorVisitator(){

        /*
        FireAlarm fireAlarm = new FireAlarm();
        MySmokeDetector mySmokeDetector = new MySmokeDetector();
        mySmokeDetector.addSmokeObserver(fireAlarm);

        MyTermometer myTermometer = new MyTermometer();
        myTermometer.addTemperatureObserver(fireAlarm);

        mySmokeDetector.checkSmoke();
        myTermometer.measureTemperature();
        */

        Sensor sensor = new Sensor();
        FireAlarm fireAlarm = new FireAlarm();

        List<Sensor> sensors = new ArrayList<Sensor>();
        sensors.add(new KitchenSensor());
        sensors.add(new DiningRoomSensor());

        for ( Sensor s : sensors ) {
            s.visitAll(new FireAlarmVisitor(fireAlarm));
        }

        SensorsIterator sensorsIterator = new SensorsIterator(sensors);
        for ( Sensor s : sensors ) {
            System.out.println(s.name);

            s.measure();
        }




    }

    public static void exampleOfChainOfResponsibility(){

        CargoSenderAdrvisor cargoSenderAdvisor = new CargoSenderAdrvisor();
        cargoSenderAdvisor.adviseSendingWay(new Cargo(20, "UK"));
        cargoSenderAdvisor.adviseSendingWay(new Cargo(0.4, "Poland"));
        cargoSenderAdvisor.adviseSendingWay(new Cargo(150, "Poland"));
        cargoSenderAdvisor.adviseSendingWay(new Cargo(10, "Ukraine"));
        cargoSenderAdvisor.adviseSendingWay(new Cargo(3, "Poland"));
    }
}

