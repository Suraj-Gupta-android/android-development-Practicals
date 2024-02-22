package com.example.myapplication;



import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;


public class DialogBoxActivity extends AppCompatActivity {
    Button btn1,btn2,btn3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dialog_box);

        btn1 = findViewById(R.id.oneBtn);
        btn2 = findViewById(R.id.twobtn);
        btn3 = findViewById(R.id.customDialog);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog alertDialog = new AlertDialog.Builder(DialogBoxActivity.this).create();

                alertDialog.setTitle("Terms & Condition ");
                alertDialog.setIcon(R.drawable.baseline_info_24);
                alertDialog.setMessage("Red All Document \nCarefully");
                alertDialog.setButton(-1,"yes",new DialogInterface.OnClickListener(){

                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        Toast.makeText(DialogBoxActivity.this, "Yes", Toast.LENGTH_SHORT).show();
                    }
                });
                alertDialog.show();

            }
        });
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder alertDialog = new AlertDialog.Builder(DialogBoxActivity.this);

                alertDialog.setTitle("Delete");
                alertDialog.setIcon(R.drawable.baseline_delete_24);
                alertDialog.setMessage("Are you sure you want to delete? ");

                alertDialog.setPositiveButton("Yes", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        Toast.makeText(DialogBoxActivity.this, "Deleted", Toast.LENGTH_SHORT).show();
                    }
                });

                alertDialog.setNegativeButton("No", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        Toast.makeText(DialogBoxActivity.this, "Welocome Back", Toast.LENGTH_SHORT).show();
                    }
                });

               alertDialog.show();
            }

        });
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Dialog dialog = new Dialog(DialogBoxActivity.this);
                dialog.setContentView(R.layout.custom_dialog_box_layout);

                Button textView = dialog.findViewById(R.id.custom_done_btn);
                dialog.setCancelable(false);

                textView.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Toast.makeText(DialogBoxActivity.this, "Order done", Toast.LENGTH_SHORT).show();
                        dialog.dismiss();
                    }
                });


                 dialog.show();
            }

        });


    }

    @Override
    public void onBackPressed() {



        AlertDialog.Builder builder = new AlertDialog.Builder(this);

        builder.setTitle("Exit");
        builder.setMessage("Do you want to exit");
        builder.setIcon(R.drawable.baseline_exit_to_app_24);

        builder.setPositiveButton("Yes", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                DialogBoxActivity.super.onBackPressed();
            }
        });
        builder.setNegativeButton("No", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                Toast.makeText(DialogBoxActivity.this, "Welcome Back", Toast.LENGTH_SHORT).show();
            }
        });
        builder.setNeutralButton("Cancle", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                Toast.makeText(DialogBoxActivity.this, "Welcome Back agian", Toast.LENGTH_SHORT).show();
            }
        });
        builder.show();


    }
}