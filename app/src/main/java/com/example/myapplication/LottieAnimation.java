package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.airbnb.lottie.LottieAnimationView;

public class LottieAnimation extends AppCompatActivity {
    LottieAnimationView lView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lottie_animation);
        lView = findViewById(R.id.lottieByCode);

        lView.setAnimation(R.raw.animation2);
        lView.playAnimation();
        lView.loop(true);


    }
}