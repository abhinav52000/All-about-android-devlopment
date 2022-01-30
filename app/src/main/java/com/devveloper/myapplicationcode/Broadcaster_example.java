package com.devveloper.myapplicationcode;


import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.widget.Toast;


public class Broadcaster_example extends BroadcastReceiver {


    @Override
    public void onReceive(Context context, Intent intent) {

        Boolean isPlaneMode=intent.getBooleanExtra("State",false);

        if(isPlaneMode==true)
        {
            Toast.makeText(context, "Airplane mode is on", Toast.LENGTH_LONG).show();
        }
        else
        {
            Toast.makeText(context, "Airplane mode is closed", Toast.LENGTH_LONG).show();

        }

    }
}
