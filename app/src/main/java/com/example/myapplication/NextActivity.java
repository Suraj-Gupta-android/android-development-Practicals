package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class NextActivity extends AppCompatActivity {
    TextView text2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_next);
        text2 = findViewById(R.id.text2);


        Intent getdata = getIntent();
       String name = getdata.getStringExtra("name");
       int age = getdata.getIntExtra("age",0);
       String add = getdata.getStringExtra("address");
       text2.setText("name :"+name+"age :"+age+"address :"+add);





    }
}