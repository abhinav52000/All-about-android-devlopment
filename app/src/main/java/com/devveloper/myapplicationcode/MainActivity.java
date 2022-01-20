package com.devveloper.myapplicationcode;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView my;
    Button click;
    @SuppressLint("ResourceAsColor")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        my=findViewById(R.id.firstcheck);
        my.setText("I am aBHINAV kUMAAR ");
        my.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                my.setText("Secret Meet");
            }
        });

    }
}