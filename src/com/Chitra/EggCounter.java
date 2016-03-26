package com.Chitra;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Observable;
import java.util.Observer;

/**
 * Created by chitrakakkar on 3/25/16.
 */
public class EggCounter implements Observer {
    int Counter = 0;

    public void update(Observable chicken, Object o) {
        if (((Chicken) chicken).laidEgg()) {
            System.out.println(chicken + " Has laid " + chicken.countObservers() + " eggs");
        }


    }
}

