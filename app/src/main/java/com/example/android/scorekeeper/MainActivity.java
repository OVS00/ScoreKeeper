package com.example.android.scorekeeper;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;
public class MainActivity extends AppCompatActivity {
    int scoreTeamA = 0;
    int scoreTeamB = 0;
    int redCardsTeamA = 0;
    int yellowCardsTeamA = 0;
    int redCardsTeamB = 0;
    int yellowCardsTeamB = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }
    public void displayScoreTeamA(int scoreTeamA) {
        TextView scoreView = findViewById(R.id.TeamAScore);
        scoreView.setText(String.valueOf(scoreTeamA));
    }
    public void displayScoreTeamB(int scoreTeamB) {
        TextView scoreView = findViewById(R.id.TeamBScore);
        scoreView.setText(String.valueOf(scoreTeamB));
    }
    public void displayRedTeamA(int redCardsTeamA) {
        TextView scoreView = findViewById(R.id.TeamARedCards);
        scoreView.setText(String.valueOf(redCardsTeamA));
    }
    public void displayRedTeamB(int redCardsTeamB) {
        TextView scoreView = findViewById(R.id.TeamBRedCards);
        scoreView.setText(String.valueOf(redCardsTeamB));
    }
    public void displayYellowTeamA(int yellowCardsTeamA) {
        TextView scoreView = findViewById(R.id.TeamAYellowCards);
        scoreView.setText(String.valueOf(yellowCardsTeamA));
    }
    public void displayYellowTeamB(int yellowCardsTeamB) {
        TextView scoreView = findViewById(R.id.TeamBYellowCards);
        scoreView.setText(String.valueOf(yellowCardsTeamB));
    }
    public void addScoreTeamA(View view) {
        scoreTeamA = scoreTeamA + 1;
        displayScoreTeamA(scoreTeamA);
    }
    public void addScoreTeamB(View view) {
        scoreTeamB = scoreTeamB + 1;
        displayScoreTeamB(scoreTeamB);
    }
    public void redCardsTeamA(View view) {
        redCardsTeamA = redCardsTeamA + 1;
        displayRedTeamA(redCardsTeamA);
    }
    public void redCardsTeamB(View view) {
        redCardsTeamB = redCardsTeamB + 1;
        displayRedTeamB(redCardsTeamB);
    }
    public void yellowCardsTeamA(View view) {
        yellowCardsTeamA = yellowCardsTeamA + 1;
        displayYellowTeamA(yellowCardsTeamA);
    }
    public void yellowCardsTeamB(View view) {
        yellowCardsTeamB = yellowCardsTeamB + 1;
        displayYellowTeamB(yellowCardsTeamB);
    }
    public void reset(View view) {
        scoreTeamA = 0;
        scoreTeamB = 0;
        redCardsTeamA = 0;
        yellowCardsTeamA = 0;
        redCardsTeamB = 0;
        yellowCardsTeamB = 0;
        displayScoreTeamA(scoreTeamA);
        displayScoreTeamB(scoreTeamB);
        displayRedTeamA(redCardsTeamA);
        displayRedTeamB(redCardsTeamB);
        displayYellowTeamA(yellowCardsTeamA);
        displayYellowTeamB(yellowCardsTeamB);
    }
}





