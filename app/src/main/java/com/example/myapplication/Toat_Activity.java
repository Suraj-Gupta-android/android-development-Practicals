package com.example.myapplication;

import static android.webkit.ConsoleMessage.MessageLevel.LOG;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.Gravity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class Toat_Activity extends AppCompatActivity {
    Button toast ,toast2;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_toat);
        toast = findViewById(R.id.toastbutton);
        toast2 = findViewById(R.id.toastButton2);

        toast.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(),"Simple Toast",Toast.LENGTH_LONG).show();
            }
        });
        toast2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Toast customtoast = new Toast(getApplicationContext());

               View view= getLayoutInflater().inflate(R.layout.custom_toast_layout,(ViewGroup) findViewById(R.id.customlayout));

                customtoast.setView(view);

                customtoast.setDuration(Toast.LENGTH_LONG);

                customtoast.setGravity(Gravity.TOP,0,0);
                TextView textmasg = view.findViewById(R.id.textmasg);
                textmasg.setText("That a grate Jobe ");

                customtoast.show();
                Log.d("Tag","Tag Massage");

            }
        });




    }
}