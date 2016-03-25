package com.Chitra;

import java.util.Observable;
import java.util.Observer;

/**
 * Created by chitrakakkar on 3/25/16.
 */
public class EggAlert implements Observer
{
    public void update(Observable chicken, Object arg)
    {
        if (((Chicken)chicken).laidEgg() )
        {
            System.out.println(chicken + " has laid an egg");
            System.out.println(arg);
        }

    }

}
