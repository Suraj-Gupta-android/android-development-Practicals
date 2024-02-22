package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.ListView;
import android.widget.Spinner;
import android.widget.Toast;

import java.util.ArrayList;

public class ListViewActivity extends AppCompatActivity {
    ArrayList<String> arrName = new ArrayList<>();
    ArrayList<String> arrId = new ArrayList<>();
    ListView listview;
    Spinner spinner;
    AutoCompleteTextView auto;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_view);

        listview = findViewById(R.id.listview);
        spinner = findViewById(R.id.edtSpinner);
        auto = findViewById(R.id.autofill);

        arrName.add("suraj gupta");
        arrName.add("mukesh gupta ");
        arrName.add("uma gupta");
        arrName.add("sarvesh gupta");
        arrName.add("parag gupta ");
        arrName.add("suraj gupta");
        arrName.add("mukesh gupta ");
        arrName.add("uma gupta");
        arrName.add("sarvesh gupta");
        arrName.add("parag gupta ");
        arrName.add("suraj gupta");
        arrName.add("mukesh gupta ");
        arrName.add("uma gupta");
        arrName.add("sarvesh gupta");
        arrName.add("parag gupta ");
        arrName.add("suraj gupta");
        arrName.add("mukesh gupta ");
        arrName.add("uma gupta");
        arrName.add("sarvesh gupta");
        arrName.add("parag gupta ");
        arrName.add("suraj gupta");
        arrName.add("mukesh gupta ");
        arrName.add("uma gupta");
        arrName.add("sarvesh gupta");
        arrName.add("parag gupta ");




        arrId.add("Addhar Card");
        arrId.add("ration Card");
        arrId.add("pan Card");
        arrId.add("e shram Card");
        arrId.add("oter Card");
        arrId.add("driving lisense Card");

        ArrayAdapter<String> listViewAdapter = new ArrayAdapter<>(getApplicationContext(), android.R.layout.simple_list_item_1,arrName);

        listview.setAdapter(listViewAdapter);

        listview.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(ListViewActivity.this, "hello baby", Toast.LENGTH_SHORT).show();
                if(position == 2){
                    Toast.makeText(ListViewActivity.this, "Kya re kutte ", Toast.LENGTH_SHORT).show();
                }
            }
        });


        ArrayAdapter<String > idSpinnerAdapter = new ArrayAdapter<>(getApplicationContext(), android.R.layout.simple_spinner_item,arrId);

        spinner.setAdapter(idSpinnerAdapter);


        auto.setAdapter(listViewAdapter);
        auto.setThreshold(1);

    }



}