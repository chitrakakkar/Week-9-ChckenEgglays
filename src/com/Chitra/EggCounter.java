package com.Chitra;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Observable;
import java.util.Observer;

/**
 * Created by chitrakakkar on 3/25/16.
 */

// this class also implements Observer because it needs to
// update the object(chicken) info whenever an object does some action(lay eggs)
public class EggCounter implements Observer
{
    public void update(Observable chicken, Object o)
            //count Observer keeps track of counting eggs for every chicken.
    {
        if (((Chicken) chicken).laidEgg())
        {
            System.out.println(chicken + " Has laid " + chicken.countObservers() + " eggs");
        }

    }



}

