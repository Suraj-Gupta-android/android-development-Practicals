package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.app.Dialog;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

import java.util.ArrayList;

public class RecycleViewActivity extends AppCompatActivity {
ArrayList<ContactModal> arrContact = new ArrayList<>();
    RecyclerView recyclerView;
    RecycleContactAdaptor2 adptor;
    Toolbar toolbar;

    FloatingActionButton openDilogButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recycle_view);
        recyclerView = findViewById(R.id.edtRecycleView);
        openDilogButton = findViewById(R.id.openDialogbtn);
        toolbar = findViewById(R.id.toolBar);
        setSupportActionBar(toolbar);

        toolbar.setBackInvokedCallbackEnabled(true);




        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        openDilogButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Dialog dialog = new Dialog(RecycleViewActivity.this);
                dialog.setContentView(R.layout.upadate_delete_layout);

                EditText edtName =dialog.findViewById(R.id.edtName);
                EditText edtContact = dialog.findViewById(R.id.edtContact);
                Button buttonAction = dialog.findViewById(R.id.updatabtn);

                buttonAction.setText("ADD");

                buttonAction.setOnClickListener(new View.OnClickListener() {
                   String name ="",contact="";

                    @Override
                    public void onClick(View v) {
                        if(!edtName.getText().toString().equals("")) {
                            name = edtName.getText().toString();
                        }
                        if(!edtContact.getText().toString().equals("")) {
                             contact = edtContact.getText().toString();
                        }
                        arrContact.add(new ContactModal(name,contact));
                        adptor.notifyItemInserted(arrContact.size()-1);
                        recyclerView.scrollToPosition(arrContact.size()-1);
                        dialog.dismiss();

                    }
                });
                dialog.show();




            }
        });








        arrContact.add(new ContactModal(R.drawable.p1,"A","1234567789"));
        arrContact.add(new ContactModal(R.drawable.p2,"b","1234567789"));
        arrContact.add(new ContactModal(R.drawable.p3,"c","1234567789"));
        arrContact.add(new ContactModal(R.drawable.p4,"d","1234567789"));
        arrContact.add(new ContactModal(R.drawable.p5,"e","1234567789"));
        arrContact.add(new ContactModal(R.drawable.p6,"f","1234567789"));
        arrContact.add(new ContactModal(R.drawable.p7,"g","1234567789"));
        arrContact.add(new ContactModal(R.drawable.p8,"h","1234567789"));
        arrContact.add(new ContactModal(R.drawable.p10,"i","1234567789"));
        arrContact.add(new ContactModal(R.drawable.p11,"j","1234567789"));
        arrContact.add(new ContactModal(R.drawable.p12,"k","1234567789"));
        arrContact.add(new ContactModal(R.drawable.p13,"l","1234567789"));
        arrContact.add(new ContactModal(R.drawable.p1,"m","1234567789"));
        arrContact.add(new ContactModal(R.drawable.p9,"n","1234567789"));
        arrContact.add(new ContactModal(R.drawable.p10,"o","1234567789"));
        arrContact.add(new ContactModal(R.drawable.p1,"A","1234567789"));
        arrContact.add(new ContactModal(R.drawable.p2,"b","1234567789"));
        arrContact.add(new ContactModal(R.drawable.p3,"c","1234567789"));
        arrContact.add(new ContactModal(R.drawable.p4,"d","1234567789"));
        arrContact.add(new ContactModal(R.drawable.p5,"e","1234567789"));
        arrContact.add(new ContactModal(R.drawable.p6,"f","1234567789"));
        arrContact.add(new ContactModal(R.drawable.p7,"g","1234567789"));
        arrContact.add(new ContactModal(R.drawable.p8,"h","1234567789"));
        arrContact.add(new ContactModal(R.drawable.p10,"i","1234567789"));
        arrContact.add(new ContactModal(R.drawable.p11,"j","1234567789"));
        arrContact.add(new ContactModal(R.drawable.p12,"k","1234567789"));
        arrContact.add(new ContactModal(R.drawable.p13,"l","1234567789"));
        arrContact.add(new ContactModal(R.drawable.p1,"m","1234567789"));
        arrContact.add(new ContactModal(R.drawable.p9,"n","1234567789"));
        arrContact.add(new ContactModal(R.drawable.p10,"o","1234567789"));


       adptor = new RecycleContactAdaptor2(this,arrContact);
        recyclerView.setAdapter(adptor);









    }
}