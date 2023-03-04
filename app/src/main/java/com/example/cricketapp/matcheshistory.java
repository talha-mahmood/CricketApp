package com.example.cricketapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class matcheshistory extends AppCompatActivity {

    private String url = "https://api.cricapi.com/v1/matches?apikey=a2b7b2ce-d324-4bac-88cc-d2127c9390c6&offset=0";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_matcheshistory);
    }
}