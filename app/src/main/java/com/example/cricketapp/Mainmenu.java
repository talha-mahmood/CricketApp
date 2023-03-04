package com.example.cricketapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Mainmenu extends AppCompatActivity {

    Button mprofilebtn,mplayersbtn,mrankingbtn, mcricinfobtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mainmenu);

        mprofilebtn = findViewById(R.id.btnprofile);
        mplayersbtn = findViewById(R.id.btnplayers);
        mrankingbtn = findViewById(R.id.btnranking);
        mcricinfobtn= findViewById(R.id.btncricinfo);

    }

    public void jumpprofile(View view)
    {
        startActivity(new Intent(Mainmenu.this,Profile.class));
    }
    public void jumpplayer(View view)
    {
        startActivity(new Intent(Mainmenu.this,Userslist.class));
    }

    public void jumpranking(View view)
    {
        startActivity(new Intent(Mainmenu.this,Ranking.class));
    }
    public void jumpcricinfo(View view)
    {
        startActivity(new Intent(Mainmenu.this,Cricinfo.class));
    }

}