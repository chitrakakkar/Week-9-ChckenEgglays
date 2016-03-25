package com.Chitra;

import java.util.LinkedList;
import java.util.Observable;
import java.util.Observer;

/**
 * Created by chitrakakkar on 3/25/16.
 */
public class EggCounter implements Observer
{
    int Counter = 0;
    public void update(Observable chicken, Object o)
    {
        String name = (((Chicken) chicken).name);
        {
            LinkedList<Chicken> ChickenList = new LinkedList<>();
            ChickenList.add(((Chicken) chicken));
            for (Chicken c : ChickenList)
            {
                if (c.laidEgg() && (c.name.equals(name)))
                {
                    Counter++;
                }

                System.out.println(chicken + " has laid " + Counter + " eggs");

            }

//        if (((Chicken) chicken).laidEgg())
//        {
//            //if(((Chicken) chicken).name.equals(((Chicken) chicken).name))
//
//           this.Counter++;
//
//
//        }
//        System.out.println(chicken + " has laid " + this.Counter + " eggs");

//        if (((Chicken) chicken).laidEgg())
//        {
//            Counter++;
//            System.out.println(chicken + " has laid " + Counter + "Eggs");
//        }

        }
    }
}
