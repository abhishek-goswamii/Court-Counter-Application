package com.example.courtcounter;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
public class MainActivity extends AppCompatActivity {
    int score = 0;
    int scoreb = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void addoneforteama(View v){
        score = score + 1;

        displayteama(score);
    }
    public void reset(View v){

        score = 0;
        displayteama(score);
        scoreb = 0;
        displayteamb(scoreb);
    }

    public void addtwoforteama(View v){
    score = score + 2;
    displayteama(score);
    }
    public void addthreeforteama(View v){
        score = score + 3;
    displayteama(score);
    }


    public void displayteama(int score){
        TextView scoreView = (TextView)  findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }
    public void displayteamb(int scoreb){
        TextView scoreView = (TextView)  findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(scoreb));
    }
    public void teamascore(int score){

        TextView scoreview = (TextView) findViewById(R.id.team_a_score);
        scoreview.setText(String.valueOf(score));

    }
    public void teambscore(int score){

        TextView scoreview = (TextView) findViewById(R.id.team_b_score);
        scoreview.setText(String.valueOf(scoreb));

    }


//    from here CODE OF TEAM B

    public void addthreeforteamb(View v){
        scoreb = scoreb + 3;

        displayteamb(scoreb);
    }

    public void addtwoforteamb(View v){

        scoreb = scoreb + 2;
        displayteamb(scoreb);
    }

    public void addoneforteamb(View v){

        scoreb = scoreb + 1;
        displayteamb(scoreb);
    }













}