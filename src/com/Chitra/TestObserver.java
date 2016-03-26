package com.Chitra;

import java.util.LinkedList;

public class TestObserver
{

    public static void main(String[] args)
    {
        //EggAlert eggMonitor = new EggAlert();
        EggCounter eggMonitor = new EggCounter();

        Chicken a = new Chicken("Mavis");
        a.addObserver(eggMonitor);
        Chicken b = new Chicken("Betty");
        b.addObserver(eggMonitor);
        Chicken c = new Chicken("Kitty");
        c.addObserver(eggMonitor);


        a.layEgg();b.layEgg();
        a.layEgg();c.layEgg();
        c.layEgg();
    }



}
