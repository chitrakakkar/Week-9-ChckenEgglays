package com.Chitra;

import java.util.Observable;

/**
 * Created by chitrakakkar on 3/25/16.
 */
public class Chicken extends Observable
{
    String name;
    boolean laidEgg = false;

    Chicken(String name)
    {
        this.name = name;
    }

    public void layEgg()
    {
        this.laidEgg = true;
        this.setChanged();
        this.notifyObservers();
        this.laidEgg = false;
    }

    public String toString() {
        return this.name;
    }

    public boolean laidEgg(){
        return laidEgg;
    }



}
