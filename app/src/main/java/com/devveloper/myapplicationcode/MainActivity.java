package com.devveloper.myapplicationcode;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;


public class MainActivity extends AppCompatActivity {


                Button start,stop;

                @Override
                protected void onCreate(Bundle savedInstanceState) {
                    super.onCreate(savedInstanceState);
                    setContentView(R.layout.activity_main);

                    start=findViewById(R.id.button3);
                    stop=findViewById(R.id.button4);

                    start.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            Intent i=new Intent(getApplicationContext(),Services_examole.class);
                            startService(i);

                        }
                    });


                    stop.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            Intent i=new Intent(getApplicationContext(),Services_examole.class);
                            stopService(i);
                        }
                    });


                    Log.d("Message","on_create");

    }


    @Override
    protected void onStart() {
        super.onStart();
        Log.d("Message","on_start");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d("Message","on_resume");
    }

    @Override
    protected void onPause() {
                    
        super.onPause();
        Log.d("Message","on_pause");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("Message","on_stop");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d("Message","on_restart");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("Message","On_Destroy");
    }

}