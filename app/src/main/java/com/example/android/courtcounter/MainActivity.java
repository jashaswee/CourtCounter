package com.example.android.courtcounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {


int scoreTeamA=0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

  public void addThreeForTeamA(View view)
  {
      scoreTeamA=scoreTeamA+3;
      displayForTeamA(scoreTeamA);

  }

    public void addTwoForTeamA(View view)
    {
        scoreTeamA=scoreTeamA+2;
        displayForTeamA(scoreTeamA);
    }

    public void addOneForTeamA(View view)
    {

        scoreTeamA=scoreTeamA+1;
        displayForTeamA(scoreTeamA );
    }
    public void displayForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }
}

