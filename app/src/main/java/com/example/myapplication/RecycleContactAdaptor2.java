package com.example.myapplication;


import android.app.AlertDialog;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.media.Image;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

import kotlin.LateinitKt;

public class RecycleContactAdaptor2 extends RecyclerView.Adapter<RecycleContactAdaptor2.ViewHolder> {
        Context context;
        ArrayList<ContactModal> arrContactList;
        RecycleContactAdaptor2(Context context, ArrayList<ContactModal> arrContactList){
            this.context = context;
            this.arrContactList=arrContactList;
        }
    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.contact_row,parent,false);

        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {


        holder.textImage.setImageResource(arrContactList.get(position).img);
        holder.textName.setText(arrContactList.get(position).name);
        holder.textContact.setText(arrContactList.get(position).contact);



        setAnimationView(holder.itemView);



        holder.llrow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Dialog dialog = new Dialog(context);
                dialog.setContentView(R.layout.upadate_delete_layout);

                   TextView name1 =  dialog.findViewById(R.id.edtName);
                   TextView con  = dialog.findViewById(R.id.edtContact);
                   Button actionBtn = dialog.findViewById(R.id.updatabtn);

                   name1.setText(arrContactList.get(position).name);
                   con.setText(arrContactList.get(position).contact);

                   actionBtn.setOnClickListener(new View.OnClickListener() {
                       @Override
                       public void onClick(View v) {

                           String name2 = name1.getText().toString();
                           String contact2 = con.getText().toString();

                           arrContactList.set(position,new ContactModal(name2,contact2));
                           notifyItemChanged(position);

                           dialog.dismiss();

                       }
                   });



                    dialog.show();

            }
        });



        holder.llrow.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {

                AlertDialog.Builder builder = new AlertDialog.Builder(context);


                builder.setTitle("Delete Contact");
                builder.setMessage("Are Do you sure delete ");
                builder.setIcon(R.drawable.baseline_delete_24);

                builder.setNegativeButton("No", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {

                    }
                });
                builder.setPositiveButton("Yes", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {

                        arrContactList.remove(position);
                        notifyItemRemoved(position);

                    }
                });
                builder.show();


                return true;
            }
        });







    }

    @Override
    public int getItemCount() {
        return arrContactList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{

            TextView textName , textContact;
            ImageView textImage;
            LinearLayout llrow;
            ViewHolder(View itemView){
                super(itemView);
                textName = itemView.findViewById(R.id.contactname);
                textContact = itemView.findViewById(R.id.contactNumber);
                textImage = itemView.findViewById(R.id.contactImage);
                llrow = itemView.findViewById(R.id.llrow);



            }

    }
    private  void setAnimationView(View view){

        Animation animation = AnimationUtils.loadAnimation(context,android.R.anim.slide_in_left);

        view.startAnimation(animation);

    }


}

