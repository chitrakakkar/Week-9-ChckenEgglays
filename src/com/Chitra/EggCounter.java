package com.Chitra;

import java.util.LinkedList;
import java.util.Observable;
import java.util.Observer;

/**
 * Created by chitrakakkar on 3/25/16.
 */
public class EggCounter implements Observer {
    int Counter = 0;

    public void update(Observable chicken, Object o)
    {
        //System.out.println(chicken + " has laid "+ chicken.countObservers() + "Eggs");


        String name = (((Chicken) chicken).name);
        {
            LinkedList<Chicken> ChickenList = new LinkedList<>();
            ChickenList.add(((Chicken) chicken));
            for (Chicken c : ChickenList) {
                if (c.laidEgg() && (c.name.equals(name))) {
                    this.Counter++;
                }

                System.out.println(chicken + " has laid " + Counter + " eggs");

            }


        }
    }
}

