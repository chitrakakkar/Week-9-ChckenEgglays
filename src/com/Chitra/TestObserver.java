package com.Chitra;

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

        a.layEgg();
        b.layEgg();
        a.layEgg();

    }



}
