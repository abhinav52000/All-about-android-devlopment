package com.devveloper.myapplicationcode;


import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.util.Log;

import androidx.annotation.Nullable;

public class Services_examole extends Service {
    @Nullable
    @Override
    public IBinder onBind(Intent intent) {
        return null;
    }

    @Override
    public void onCreate() {
        super.onCreate();

        Log.d("Service","Service is created");
    }

    @Override
    public int onStartCommand(Intent intent, int flags, int startId) {

        Log.d("Service","Service is started");
        return super.onStartCommand(intent, flags, startId);
    }


    @Override
    public void onDestroy() {
        super.onDestroy();
        Log.d("Service","Service is Stopped");
    }
}


//Service includes message, Music, Map, and many more are basically of three types.
