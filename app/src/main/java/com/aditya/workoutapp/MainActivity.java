package com.aditya.workoutapp;

import android.os.Bundle;
import android.view.View;
import android.widget.Spinner;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.List;

public class MainActivity extends AppCompatActivity {
private workoutExpert expert = new workoutExpert();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void Find_workout1(View view)
    {
        TextView workouts = (TextView) findViewById(R.id.textView2);
        Spinner workouttype = (Spinner) findViewById(R.id.spinner1);
        String workout = String.valueOf(workouttype.getSelectedItem());
        //workouts.setText(workout);
        List <String> workoutList = expert.getworkouts(workout);
        StringBuilder workoutformatted = new StringBuilder();
        for(String work : workoutList)
        {
            workoutformatted.append(work).append('\n');
        }
        workouts.setText(workoutformatted);
    }
}
