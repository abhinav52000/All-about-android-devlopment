package com.devveloper.myapplicationcode;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {


                TextView textView;
                Button button,button2;
                int counter=0;

                @Override
                protected void onCreate(Bundle savedInstanceState) {
                    super.onCreate(savedInstanceState);
                    setContentView(R.layout.activity_main);




                    textView=findViewById(R.id.textView);
                    button=findViewById(R.id.button);
                    button2=findViewById(R.id.button2);

                    button2.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            Intent i=new Intent(getApplicationContext(),second_link_activity.class);
                            startActivity(i);
                        }
                    });

                    button.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {

                            counter+=1;
                            textView.setText(""+counter);
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