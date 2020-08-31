package com.aditya.workoutapp;

import java.util.ArrayList;
import java.util.List;

public class workoutExpert {
    public List <String> getworkouts(String workouttypes)
    {
         List <String> workout = new ArrayList<String>();
         if(workouttypes.equals("chest"))
         {
             workout.add("Bench Press");
             workout.add("Cable Fly");
         }
        else if(workouttypes.equals("tricepts"))
        {
            workout.add("Tricepts Extentions");
            workout.add("Tricepts Pushdowns");
        }
        else if(workouttypes.equals("shoulders"))
        {
            workout.add("shoulder press");
        }
        else if(workouttypes.equals("bisepts"))
        {
            workout.add("Bisepts curls");
        }
        return workout;
    }
}
