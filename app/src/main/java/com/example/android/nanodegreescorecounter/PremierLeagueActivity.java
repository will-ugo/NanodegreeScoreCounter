package com.example.android.nanodegreescorecounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class PremierLeagueActivity extends AppCompatActivity {

    int arsenalScore = 0;
    int mancityScore = 0;
    int arsenalFoul = 0;
    int mancityFoul = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_premier_league);

        TextView footballCounter = findViewById(R.id.football_counter);
        TextView nameID = findViewById(R.id.name_id);
        TextView premierID = findViewById(R.id.premier_id);
        TextView leagueID = findViewById(R.id.league_id);
        TextView arsenalName = findViewById(R.id.arsenal_name);
        ImageView arsenalLogo = findViewById(R.id.arsenal_logo);
        TextView manCity = findViewById(R.id.man_city);
        ImageView mancityLogo = findViewById(R.id.man_city_logo);
        Button arsenalGoalButton = findViewById(R.id.arsenal_goal_button);
        Button mancityGoalButton = findViewById(R.id.man_city_goal_button);
        Button arsenalFoulButton = findViewById(R.id.arsenal_foul_button);
        Button mancityFoulButton = findViewById(R.id.mancity_foul_button);
        Button resetButton = findViewById(R.id.reset_button);
        footballCounter.setText("FOOTBALL COUNTER");
        nameID.setText("by William Geoffrey-Nwankaji");
        premierID.setText("Premier");
        leagueID.setText("League");
        arsenalName.setText("Arsenal");
        arsenalLogo.setImageResource(R.drawable.arsenal);
        manCity.setText("Man City");
        mancityLogo.setImageResource(R.drawable.mancity);

        arsenalGoalButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                arsenalScore = arsenalScore + 1;
                showArsenalScore(arsenalScore);
            }
        });

        mancityGoalButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mancityScore = mancityScore + 1;
                showMancityScore(mancityScore);
            }
        });

        arsenalFoulButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                arsenalFoul = arsenalFoul + 1;
                showArsenalFoul(arsenalFoul);
            }
        });

        mancityFoulButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mancityFoul = mancityFoul + 1;
                showMancityFoul(mancityFoul);
            }
        });

        resetButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showArsenalScore(arsenalScore = 0);
                showMancityScore(mancityScore = 0);
                showArsenalFoul(arsenalFoul = 0);
                showMancityFoul(mancityFoul = 0);
            }
        });
    }

    public void showArsenalScore(int score) {
        TextView zeroText = findViewById(R.id.zero_text);
        zeroText.setText(String.valueOf(score));
    }

    public void showMancityScore(int score) {
        TextView zeroTextTwo = findViewById(R.id.zero_text_two);
        zeroTextTwo.setText(String.valueOf(score));
    }

    public void showArsenalFoul(int foul) {
        TextView arsenalfoulZero = findViewById(R.id.arsenal_foul_zero);
        arsenalfoulZero.setText(String.valueOf(foul));
    }

    public void showMancityFoul(int foul) {
        TextView mancityFoulZero = findViewById(R.id.mancity_foul_zero);
        mancityFoulZero.setText(String.valueOf(foul));
    }
}
