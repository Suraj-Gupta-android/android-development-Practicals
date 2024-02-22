package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView text1,text2,text3,text4,text5,text6,text7,text8,text9,text10,text11,text12;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        text1 = findViewById(R.id.text1);
        text2= findViewById(R.id.text2);
        text3 = findViewById(R.id.lottietxet);
        text4 = findViewById(R.id.listText);
        text5 = findViewById(R.id.styleandthemes);
        text6 = findViewById(R.id.cardView);
        text7 = findViewById(R.id.recycleView);
        text8 = findViewById(R.id.toolBar);
        text9 = findViewById(R.id.customDraw);
        text10 = findViewById(R.id.toastbtn);
        text11 = findViewById(R.id.alearbox);
        text12 = findViewById(R.id.notifiction);

        Intent inext = new Intent(MainActivity.this,NextActivity.class);

        text1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                inext.putExtra("name","Suraj");
                inext.putExtra("age",23);
                inext.putExtra("address","gorakhpur");
                startActivity(inext);
            }
        });
        text2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent animation = new Intent(MainActivity.this, AnimationActivity.class);
                startActivity(animation);
            }
        });
        text3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent lottie = new Intent(getApplicationContext(),LottieAnimation.class);
                startActivity(lottie);
            }
        });

        text4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent listWiews = new Intent(getApplicationContext(), ListViewActivity.class);
                startActivity(listWiews);
            }
        });



        text5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent styleAndTheme = new Intent(getApplicationContext(),StylaeAndThemesActivity.class);
                startActivity(styleAndTheme);
            }
        });

        text6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent cardViews = new Intent(getApplicationContext(), CardViewActivity.class);
                startActivity(cardViews);
            }
        });

        text7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent recyclerViews = new Intent(getApplicationContext(),RecycleViewActivity.class);
                startActivity(recyclerViews);
            }
        });
        text8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent toolbar = new Intent(getApplicationContext(),ToolBarActivity.class);
                startActivity(toolbar);
            }
        });

        text9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent custom_drawalbe = new Intent(getApplicationContext(),Custom_drawable.class);
                startActivity(custom_drawalbe);
            }
        });

        text10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent toast = new Intent(getApplicationContext(),Toat_Activity.class);
                startActivity(toast);
            }
        });

        text11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent dialogboxe = new Intent(getApplicationContext(),DialogBoxActivity.class);
                startActivity(dialogboxe);
            }
        });

        text12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent notification = new Intent(getApplicationContext(),Notification_Activity.class);
                startActivity(notification);

            }
        });



    }
}