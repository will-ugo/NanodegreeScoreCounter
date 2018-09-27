package com.example.android.nanodegreescorecounter;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView footballCounter = findViewById(R.id.football_counter);
        TextView nameID = findViewById(R.id.name_id);
        TextView premierLeague = findViewById(R.id.premier_league);
        TextView laLiga = findViewById(R.id.la_liga);
        TextView bundesLiga = findViewById(R.id.bundes_liga);
        TextView premLeagueText = findViewById(R.id.premier_league_text_scores);
        TextView laligaTextScores = findViewById(R.id.la_liga_text_scores);
        TextView bundesligaTextScores = findViewById(R.id.bundesliga_text_scores);

        footballCounter.setText("FOOTBALL COUNTER");
        nameID.setText("by William Geoffrey-Nwankaji");
        premierLeague.setText("Premier \nLeague");
        laLiga.setText("La \nLiga");
        bundesLiga.setText("Bundes \nLiga");
        premLeagueText.setText("Click Premier League for Scores");
        laligaTextScores.setText("Click La Liga for \nScores");
        bundesligaTextScores.setText("Click Bundes Liga for Scores");

        premierLeague.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent myIntent = new Intent(MainActivity.this, PremierLeagueActivity.class);
                startActivity(myIntent);
            }
        });

        laLiga.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent myIntent = new Intent(MainActivity.this, LaLigaActivity.class);
                startActivity(myIntent);
            }
        });

        bundesLiga.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent myIntent = new Intent(MainActivity.this, BundesLigaActivity.class);
                startActivity(myIntent);
            }
        });

    }
}
