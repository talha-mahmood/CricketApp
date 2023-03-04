package com.example.cricketapp;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

public class MatchAdapter {

    public class ViewHolder extends RecyclerView.ViewHolder{

        TextView team1Tv,team2Tv,matchTypeTv,matchStatusTv,dateTv;
        CardView cardView;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
        }
    }
}
