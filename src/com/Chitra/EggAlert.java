package com.Chitra;

import java.util.Observable;
import java.util.Observer;

/**
 * Created by chitrakakkar on 3/25/16.
 */

// this class implement from Observer interface
// which has a method called update and is called whenver any change
// happens in the observable objects
public class EggAlert implements Observer
{
    public void update(Observable chicken, Object arg)
    {
        // updates the chickens if chicken object perform the laid egg action
        if (((Chicken)chicken).laidEgg() )
        {
            System.out.println(chicken + " has laid an egg");
        }

    }

}
