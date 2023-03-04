package com.example.cricketapp;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

public class matchprogress extends AppCompatActivity {

    Button one, two, three, four, six, wide, no, out;
    Button convert;
    EditText resultconvert;
    int runs = 0, wickets=0, balls=0;
    //double over = 0.0;
    EditText run, wicket, over;
    Button Extra;
    EditText exruns;
    @SuppressLint("SetTextI18n")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        run = (EditText)findViewById(R.id.runs);
        wicket = (EditText) findViewById(R.id.out);
        over = (EditText)findViewById(R.id.over);
        one = (Button)findViewById(R.id.one);
        two = (Button)findViewById(R.id.two);
        three = (Button)findViewById(R.id.three);
        four = (Button)findViewById(R.id.four);
        six = (Button)findViewById(R.id.six);
        wide = (Button)findViewById(R.id.wide);
        no = (Button)findViewById(R.id.no);
        out = (Button)findViewById(R.id.button2);
        convert = (Button)findViewById(R.id.convert);
        resultconvert = (EditText)findViewById(R.id.covertedresult);
        Extra = (Button)findViewById(R.id.button3);
        exruns = (EditText)findViewById(R.id.extra);

        one.setOnClickListener(v -> {
            runs = runs+1;
            run.setText(Integer.toString(runs));
            balls=balls+1;
            over.setText(Integer.toString(balls));
        });

        two.setOnClickListener(v -> {
            runs = runs+2;
            run.setText(Integer.toString(runs));
            balls = balls+1;
            over.setText(Integer.toString(balls));
        });

        three.setOnClickListener(v -> {
            runs = runs+3;
            run.setText(Integer.toString(runs));
            balls = balls+1;
            over.setText(Integer.toString(balls));
        });

        four.setOnClickListener(v -> {
            runs = runs+4;
            run.setText(Integer.toString(runs));
            balls = balls+1;
            over.setText(Integer.toString(balls));
        });

        six.setOnClickListener(v -> {
            runs = runs+6;
            run.setText(Integer.toString(runs));
            balls = balls+1;
            over.setText(Integer.toString(balls));
        });

        wide.setOnClickListener(v -> {
            runs = runs+1;
            run.setText(Integer.toString(runs));
        });

        no.setOnClickListener(v -> {

            runs = runs+1;
            run.setText(Integer.toString(runs));
        });

        out.setOnClickListener(v -> {
            wickets = wickets+1;
            wicket.setText(Integer.toString(wickets));
            balls = balls+1;
            over.setText(Integer.toString(balls));
        });

        convert.setOnClickListener(v -> {
            String no=over.getText().toString();
            int a = Integer.parseInt(no);
            int rem = a%6;
            int quotient = a/6;
            resultconvert.setText((quotient+"."+rem));
        });

        Extra.setOnClickListener(v -> {
            String no = exruns.getText().toString();
            int zero =0;
            int a = Integer.parseInt(no);
            runs = runs+a;
            run.setText(Integer.toString(runs));
            exruns.setText(Integer.toString(zero));
        });
    }
}