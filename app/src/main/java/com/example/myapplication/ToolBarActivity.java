package com.example.myapplication;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;


import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.Toast;

public class ToolBarActivity extends AppCompatActivity {

    Toolbar toolbar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tool_bar);
        toolbar = findViewById(R.id.toolBar2);

        setSupportActionBar(toolbar);

        setTitle("Tool Bar ");



        toolbar.setSubtitle("Sub Title");

        if (getSupportActionBar() != null) {

            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        }


    }





    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        new MenuInflater(getApplicationContext()).inflate(R.menu.opt_menu,menu);
        return super.onCreateOptionsMenu(menu);
    }


    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item){
            int itemid = item.getItemId();

            if (itemid == R.id.opt_new) {
                Toast.makeText(this, "Add New", Toast.LENGTH_LONG).show();
            } else if (itemid == R.id.opt_open) {
                Toast.makeText(this, "Open File", Toast.LENGTH_LONG).show();
            } else if (itemid == R.id.opt_save) {
                Toast.makeText(this, "Save File", Toast.LENGTH_LONG).show();
            } else if (itemid == android.R.id.home) {
                super.onBackPressed();
            }


            return super.onOptionsItemSelected(item);


        }
}
