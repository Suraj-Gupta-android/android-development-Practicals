package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.TextView;

public class AnimationActivity extends AppCompatActivity {
    TextView textanim;
    Button alpha,rotat,translate,scale;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_animation);
        alpha = findViewById(R.id.button3);
        rotat = findViewById(R.id.button4);
        scale = findViewById(R.id.button2);
        translate = findViewById(R.id.button);
        textanim = findViewById(R.id.textedt);
       Animation translateAnim = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.translate);

        translate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                textanim.startAnimation(translateAnim);


            }
        });

        Animation scaleAnim = AnimationUtils.loadAnimation(this,R.anim.scale);

        scale.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textanim.startAnimation(scaleAnim);
            }
        });
        Animation alphaAnim = AnimationUtils.loadAnimation(this,R.anim.alpha);

        alpha.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                textanim.startAnimation(alphaAnim);
            }
        });

        Animation rotation = AnimationUtils.loadAnimation(this,R.anim.rotat);
        rotat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textanim.startAnimation(rotation);
            }
        });



    }
}