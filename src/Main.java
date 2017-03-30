import com.designpatterns.fasade.Fasade;
import com.designpatterns.strategy.Strategy;


import java.util.Scanner;

public class Main {

    static Fasade Fan; // for fasade
    static Strategy ReadSortSave;
    public static void main (String [] args ){

        //exampleOfFasade();

    }

    public static void exampleOfFasade(){
        Fan = new Fasade();
        Fan.turnON();
        Fan.turnOFF();
    }

    public static void exampleOfStrategy(){
        ReadSortSave = new Strategy();
        Scanner in = new Scanner(System.in);
        System.out.println("What file do you want to read? 0 - txt, 1-'XML'");



    }
}

