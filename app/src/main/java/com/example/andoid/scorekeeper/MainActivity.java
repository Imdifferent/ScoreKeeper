package com.example.andoid.scorekeeper;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    /**
     * Global variables
     */

    int scoreTeamA = 0;
    int scoreTeamB = 0;
    int foulForTeamA = 0;
    int foulForTeamB = 0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * Adding value methods for Team A and Team B
     */

    public void addThreeForTeamA(View v) {
        scoreTeamA += +3;
        displayForTeamA(scoreTeamA);
    }

    public void addTwoForTeamA(View v) {
        scoreTeamA += +2;
        displayForTeamA(scoreTeamA);
    }

    public void addOneForTeamA(View v) {
        scoreTeamA += +1;
        displayForTeamA(scoreTeamA);
    }

    public void addThreeForTeamB(View v) {
        scoreTeamB += +3;
        displayForTeamB(scoreTeamB);
    }

    public void addTwoForTeamB(View v) {
        scoreTeamB += +2;
        displayForTeamB(scoreTeamB);
    }

    public void addOneForTeamB(View v) {
        scoreTeamB += +1;
        displayForTeamB(scoreTeamB);
    }

    public void addFoulForTeamA(View v) {
        foulForTeamA += +1;
        displayForFoulTeamA(foulForTeamA);

    }

    public void addFoulForTeamB(View v) {
        foulForTeamB += +1;
        displayForFoulTeamB(foulForTeamB);
    }

    /**
     * Reset all displayed value
     */
    public void resetButton(View v) {
        scoreTeamA = 0;
        scoreTeamB = 0;
        foulForTeamA = 0;
        foulForTeamB = 0;
        displayForFoulTeamA(0);
        displayForFoulTeamB(0);
        displayForTeamA(0);
        displayForTeamB(0);
    }

    /**
     * Displays the given score for Team A.
     */
    public void displayForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Displays the given score for Team B.
     */

    public void displayForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Displays the given foul for Team A.
     */

    public void displayForFoulTeamA(int foul) {
        TextView foulView = (TextView) findViewById(R.id.team_a_fouls);
        foulView.setText(String.valueOf(foul));
    }

    /**
     * Displays the given foul for Team B.
     */

    public void displayForFoulTeamB(int foul) {
        TextView foulView = (TextView) findViewById(R.id.team_b_fouls);
        foulView.setText(String.valueOf(foul));
    }
}

