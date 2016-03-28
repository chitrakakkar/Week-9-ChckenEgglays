package com.Chitra;

import java.util.LinkedList;

public class TestObserver
{
    // the main method..program starts from here

    public static void main(String[] args)
    {
        //EggAlert eggMonitor = new EggAlert();

        //create EggCounter  object
        EggCounter eggMonitor = new EggCounter();

        // create chicken objects
        Chicken a = new Chicken("Mavis");
        // the object calls a pre-defined method from observable class ; add observer
        // chicken class extends the observable class so all the objects have access to this method
        a.addObserver(eggMonitor);
        Chicken b = new Chicken("Betty");
        b.addObserver(eggMonitor);
        Chicken c = new Chicken("Kitty");
        c.addObserver(eggMonitor);

        // chicken objects calling local method from the class.
        a.layEgg();b.layEgg();
        a.layEgg();c.layEgg();
        c.layEgg();
    }



}
