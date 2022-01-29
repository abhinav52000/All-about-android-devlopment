package com.devveloper.myapplicationcode;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class second_link_activity extends AppCompatActivity {


    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second_link);

        button=findViewById(R.id.button4);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent j=new Intent(getApplicationContext(),MainActivity.class);
                startActivity(j);
            }
        });

        Log.d("Message","Second_on_create");
    }


    @Override
    protected void onStart() {
        super.onStart();
        Log.d("Message","Second_on_start");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d("Message","Second_on_resume");
    }

    @Override
    protected void onPause() {

        super.onPause();
        Log.d("Message","Second_on_pause");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("Message","Second_on_stop");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d("Message","Second_on_restart");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("Message","Second_On_Destroy");
    }
}