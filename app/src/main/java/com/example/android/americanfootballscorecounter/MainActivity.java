package com.example.android.americanfootballscorecounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int teamAScore = 0;
    int teamBScore = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void ResetScore(View view) {
        teamAScore = 0;
        teamBScore = 0;
        display();
    }

    public void add_touchdown_A(View view) {
        teamAScore += 6;
        display();
    }

    public void add_fieldgoal_A(View view) {
        teamAScore += 3;
        display();
    }

    public void add_safety_A(View view) {
        teamAScore += 2;
        display();
    }

    public void add_extrapoint_A(View view) {
        teamAScore += 1;
        display();
    }

    public void add_touchdown_B(View view) {
        teamBScore += 6;
        display();
    }

    public void add_fieldgoal_B(View view) {
        teamBScore += 3;
        display();
    }

    public void add_safety_B(View view) {
        teamBScore += 2;
        display();
    }

    public void add_extrapoint_B(View view) {
        teamBScore += 1;
        display();
    }


    public void display() {
        TextView scoreViewA = (TextView) findViewById(R.id.scoreA);
        TextView scoreViewB = (TextView) findViewById(R.id.scoreB);
        scoreViewA.setText(String.valueOf(teamAScore));
        scoreViewB.setText(String.valueOf(teamBScore));
    }


}
