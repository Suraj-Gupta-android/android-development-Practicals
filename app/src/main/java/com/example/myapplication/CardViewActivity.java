package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.os.Bundle;

public class CardViewActivity extends AppCompatActivity {
    CardView cardView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_card_view);
        cardView = findViewById(R.id.cardedt);

        cardView.setRadius(20.0f);
        cardView.setCardElevation(10.0f);
        cardView.setUseCompatPadding(true);



    }
}