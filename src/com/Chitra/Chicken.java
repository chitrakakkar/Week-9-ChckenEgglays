package com.Chitra;

import java.util.Observable;

/**
 * Created by chitrakakkar on 3/25/16.
 */
// a chicken class which extends observable class
    //gets access to all the methods defined in the observable class
public class Chicken extends Observable
{
    // local variables
    String name;
    boolean laidEgg = false;
    // constructor
    Chicken(String name)
    {
        this.name = name;
    }
    // user-defined method
    public void layEgg()
    {
        this.laidEgg = true;
        this.setChanged();
        this.notifyObservers();
        this.laidEgg = false;
    }
    // overriding
    public String toString() {
        return this.name;
    }
    // user-defined method
    public boolean laidEgg(){
        return laidEgg;
    }



}
