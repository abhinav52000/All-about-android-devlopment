package com.devveloper.myapplicationcode;

import androidx.appcompat.app.AppCompatActivity;
import androidx.localbroadcastmanager.content.LocalBroadcastManager;

import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.os.Bundle;



public class MainActivity extends AppCompatActivity {

                Broadcaster_example br=new Broadcaster_example();


                @Override
                protected void onCreate(Bundle savedInstanceState) {
                    super.onCreate(savedInstanceState);
                    setContentView(R.layout.activity_main);

    }

    @Override
    protected void onStart() {
        super.onStart();
        IntentFilter filer = new IntentFilter();
        filer.addAction(Intent.ACTION_AIRPLANE_MODE_CHANGED);
        this.registerReceiver(br, filer);
    }

    @Override
    protected void onStop() {
        super.onStop();
        this.unregisterReceiver(br);
    }
}