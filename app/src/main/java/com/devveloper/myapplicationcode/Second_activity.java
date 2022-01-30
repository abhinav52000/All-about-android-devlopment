package com.devveloper.myapplicationcode;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class Second_activity extends AppCompatActivity {


    TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        textView=findViewById(R.id.textView);
        Intent intent= getIntent();
        String name1=intent.getStringExtra("Keyword");
        textView.setText(name1);

    }
}