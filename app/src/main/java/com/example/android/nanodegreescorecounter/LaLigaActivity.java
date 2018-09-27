package com.example.android.nanodegreescorecounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class LaLigaActivity extends AppCompatActivity {

    int barcelonaScore = 0;
    int madridScore = 0;
    int barcelonaFoul = 0;
    int madridFoul = 0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_la_liga);


        TextView footballCounter = findViewById(R.id.football_counter);
        TextView nameID = findViewById(R.id.name_id);
        TextView laID = findViewById(R.id.la_id);
        TextView ligaID = findViewById(R.id.liga_id);
        TextView barcelonaName = findViewById(R.id.barcelona_name);
        ImageView barcelonaLogo = findViewById(R.id.barcelona_logo);
        TextView madrid = findViewById(R.id.madrid);
        ImageView madridLogo = findViewById(R.id.madrid_logo);
        Button barcelonaGoalButton = findViewById(R.id.barcelona_goal_button);
        Button madridGoalButton = findViewById(R.id.madrid_goal_button);
        Button barcelonaFoulButton = findViewById(R.id.barcelona_foul_button);
        Button madridFoulButton = findViewById(R.id.madrid_foul_button);
        Button resetButton = findViewById(R.id.reset_button);
        footballCounter.setText("FOOTBALL COUNTER");
        nameID.setText("by William Geoffrey-Nwankaji");
        laID.setText("La");
        ligaID.setText("Liga");
        barcelonaName.setText("Barcelona");
        barcelonaLogo.setImageResource(R.drawable.barcelona);
        madrid.setText("Madrid");
        madridLogo.setImageResource(R.drawable.madrid);

        barcelonaGoalButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                barcelonaScore = barcelonaScore + 1;
                showBarcelonaScore(barcelonaScore);
            }
        });

        madridGoalButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                madridScore = madridScore + 1;
                showMadridScore(madridScore);
            }
        });

        barcelonaFoulButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                barcelonaFoul = barcelonaFoul + 1;
                showBarcelonaFoul(barcelonaFoul);
            }
        });

        madridFoulButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                madridFoul = madridFoul + 1;
                showMadridFoul(madridFoul);
            }
        });

        resetButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showBarcelonaScore(barcelonaScore = 0);
                showMadridScore(madridScore = 0);
                showBarcelonaFoul(barcelonaFoul = 0);
                showMadridFoul(madridFoul = 0);
            }
        });

    }

    public void showBarcelonaScore(int score) {
        TextView zeroText = findViewById(R.id.zero_text);
        zeroText.setText(String.valueOf(score));
    }

    public void showMadridScore(int score) {
        TextView zeroTextTwo = findViewById(R.id.zero_text_two);
        zeroTextTwo.setText(String.valueOf(score));
    }

    public void showBarcelonaFoul(int foul) {
        TextView barcelonafoulZero = findViewById(R.id.barcelona_foul_zero);
        barcelonafoulZero.setText(String.valueOf(foul));
    }

    public void showMadridFoul(int foul) {
        TextView madridFoulZero = findViewById(R.id.madrid_foul_zero);
        madridFoulZero.setText(String.valueOf(foul));
    }

}
