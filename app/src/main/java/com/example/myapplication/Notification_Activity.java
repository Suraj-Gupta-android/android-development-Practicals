package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.res.ResourcesCompat;


import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class Notification_Activity extends AppCompatActivity {
    private static final String MASSAGE_CHANEL_ID = "Massage Notification";
    private static final String UPDATE_CHANEL_ID = "Update chanel";
    private static final String  CUSTOM_CHANEL_ID = "constom notification ";
    private static final int CUSTOM_NOTIFICATION_ID  = 300;
    private static final int MASSAGE_NOTIFICATION_ID = 100;
    private static final  int UPDATE_NOTIFICATION_ID = 200;
    Button firstnotification ,update_Notification,custButtom;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_notification);

        firstnotification  = findViewById(R.id.firstnotification);
        update_Notification = findViewById(R.id.update_Notification);
        custButtom = findViewById(R.id.custButton);



        firstnotification.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Drawable drawable = ResourcesCompat.getDrawable(getResources(),R.drawable.db,null);

                BitmapDrawable bitmapDrawable = (BitmapDrawable)drawable;


                Bitmap icon = null;
                if (bitmapDrawable != null) {
                    icon = bitmapDrawable.getBitmap();
                }

                //Massage Notification

                NotificationManager nm = (NotificationManager) getSystemService(NOTIFICATION_SERVICE);
                Notification masNotification;

                if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
                    masNotification = new Notification.Builder(Notification_Activity.this)
                            .setContentText("New Massage ")
                            .setSubText("This is massage Notification")
                            .setLargeIcon(icon)
                            .setSmallIcon(R.drawable.db)
                            .setChannelId(MASSAGE_CHANEL_ID)
                            .build();
                    nm.createNotificationChannel(new NotificationChannel(MASSAGE_CHANEL_ID,"Massage chanel",NotificationManager.IMPORTANCE_HIGH));
                }else{
                    masNotification = new Notification.Builder(Notification_Activity.this)
                            .setContentText("New Massage ")
                            .setSubText("This is massage Notification")
                            .setLargeIcon(icon)
                            .setSmallIcon(R.drawable.db)
                            .build();
                }
                Toast.makeText(Notification_Activity.this, "massage notification", Toast.LENGTH_SHORT).show();
                     nm.notify(MASSAGE_NOTIFICATION_ID,masNotification);

            }
        });

        //Update Notification

        update_Notification.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            NotificationManager nManager =  (NotificationManager) getSystemService(NOTIFICATION_SERVICE);


            Drawable drawable = ResourcesCompat.getDrawable(getResources(),R.drawable.update,null);

            BitmapDrawable bitmapDrawable = (BitmapDrawable) drawable;

            Bitmap update_largeIcon = bitmapDrawable != null ? bitmapDrawable.getBitmap() : null;

                Notification update_noti;


                if (android.os.Build.VERSION.SDK_INT >= android.os.Build.VERSION_CODES.O) {


                    update_noti = new Notification.Builder(Notification_Activity.this)
                            .setContentText("Update ")
                            .setSubText("Update yor System ")
                            .setLargeIcon(update_largeIcon)
                            .setSmallIcon(R.drawable.update)
                            .setChannelId(UPDATE_CHANEL_ID)
                            .build();

                    nManager.createNotificationChannel(new NotificationChannel(UPDATE_CHANEL_ID,"Update notification ",NotificationManager.IMPORTANCE_HIGH));
                }else {
                    update_noti = new Notification.Builder(Notification_Activity.this)
                            .setContentText("Update ")
                            .setSubText("Update your System ")
                            .setLargeIcon(update_largeIcon)
                            .setSmallIcon(R.drawable.update)
                            .build();

                }
                Toast.makeText(Notification_Activity.this, "update Notification", Toast.LENGTH_SHORT).show();
                nManager.notify(UPDATE_NOTIFICATION_ID,update_noti);


            }
        });

        custButtom.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent masintent = new Intent(getApplicationContext(),RecycleViewActivity.class);
                masintent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                PendingIntent pendingIntent = PendingIntent.getActivity(Notification_Activity.this,0,masintent,PendingIntent.FLAG_UPDATE_CURRENT);

                NotificationManager notificationManager =(NotificationManager) getSystemService(NOTIFICATION_SERVICE);

                Notification customNotification ;
                if(Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {


                    customNotification = new Notification.Builder(Notification_Activity.this)
                            .setContentText("New Massage")
                            .setContentTitle("Massage")
                            .setContentIntent(pendingIntent)
                            .setSmallIcon(R.drawable.baseline_notification_important_24)
                            .setLargeIcon(((BitmapDrawable)(ResourcesCompat.getDrawable(getResources(),R.drawable.p6,null))).getBitmap())
                            .setSubText("this is custon Notification ")
                            .setChannelId(CUSTOM_CHANEL_ID)
                            .build();
                    notificationManager.createNotificationChannel(new NotificationChannel(CUSTOM_CHANEL_ID,"custom chanel",NotificationManager.IMPORTANCE_HIGH));
                }else{


                    customNotification = new Notification.Builder(Notification_Activity.this)
                            .setContentText("New Massage")
                            .setContentTitle("Massage")
                            .setContentIntent(pendingIntent)
                            .setSmallIcon(R.drawable.baseline_notification_important_24)
                            .setLargeIcon(((BitmapDrawable)(ResourcesCompat.getDrawable(getResources(),R.drawable.p6,null))).getBitmap())
                            .setSubText("this is custon Notification ")
                            .build();

                }
                notificationManager.notify(CUSTOM_NOTIFICATION_ID,customNotification);




            }
        });

    }
}