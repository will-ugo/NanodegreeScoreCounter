package com.example.android.nanodegreescorecounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class BundesLigaActivity extends AppCompatActivity {

    int bayernScore = 0;
    int dortmundScore = 0;
    int bayernFoul = 0;
    int dortmundFoul = 0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bundes_liga);

        TextView footballCounter = findViewById(R.id.football_counter);
        TextView nameID = findViewById(R.id.name_id);
        TextView bundesID = findViewById(R.id.bundes_id);
        TextView ligaID = findViewById(R.id.liga_id);
        TextView bayernName = findViewById(R.id.bayern_name);
        ImageView bayernLogo = findViewById(R.id.bayern_logo);
        TextView dortmund = findViewById(R.id.dortmund);
        ImageView dortmundLogo = findViewById(R.id.dortmund_logo);
        Button bayernGoalButton = findViewById(R.id.bayern_goal_button);
        Button dortmundGoalButton = findViewById(R.id.dortmund_goal_button);
        Button bayernFoulButton = findViewById(R.id.bayern_foul_button);
        Button dortmundFoulButton = findViewById(R.id.dortmund_foul_button);
        Button resetButton = findViewById(R.id.reset_button);
        footballCounter.setText("FOOTBALL COUNTER");
        nameID.setText("by William Geoffrey-Nwankaji");
        bundesID.setText("Bundes");
        ligaID.setText("Liga");
        bayernName.setText("Bayern");
        bayernLogo.setImageResource(R.drawable.bayern);
        dortmund.setText("Dortmund");
        dortmundLogo.setImageResource(R.drawable.dortmund);

        bayernGoalButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                bayernScore = bayernScore + 1;
                showBayernScore(bayernScore);
            }
        });

        dortmundGoalButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                dortmundScore = dortmundScore + 1;
                showDortmundScore(dortmundScore);
            }
        });

        bayernFoulButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                bayernFoul = bayernFoul + 1;
                showBayernFoul(bayernFoul);
            }
        });

        dortmundFoulButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                dortmundFoul = dortmundFoul + 1;
                showDortmundFoul(dortmundFoul);
            }
        });

        resetButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showBayernScore(bayernScore = 0);
                showDortmundScore(dortmundScore = 0);
                showBayernFoul(bayernFoul = 0);
                showDortmundFoul(dortmundFoul = 0);
            }
        });
    }

    public void showBayernScore(int score) {
        TextView zeroText = findViewById(R.id.zero_text);
        zeroText.setText(String.valueOf(score));
    }

    public void showDortmundScore(int score) {
        TextView zeroTextTwo = findViewById(R.id.zero_text_two);
        zeroTextTwo.setText(String.valueOf(score));
    }

    public void showBayernFoul(int foul) {
        TextView bayernfoulZero = findViewById(R.id.bayern_foul_zero);
        bayernfoulZero.setText(String.valueOf(foul));
    }

    public void showDortmundFoul(int foul) {
        TextView dortmundFoulZero = findViewById(R.id.dortmund_foul_zero);
        dortmundFoulZero.setText(String.valueOf(foul));
    }
}
