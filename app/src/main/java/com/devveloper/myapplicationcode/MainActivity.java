package com.devveloper.myapplicationcode;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;


public class MainActivity extends AppCompatActivity {


                EditText editText;
                Button button;

                @Override
                protected void onCreate(Bundle savedInstanceState) {
                    super.onCreate(savedInstanceState);
                    setContentView(R.layout.activity_main);

                    editText=findViewById(R.id.edittext);
                    button=findViewById(R.id.secondlink);
                    button.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {

                            String name=editText.getText().toString();
                            Intent intent= new Intent(MainActivity.this,Second_activity.class);
                            intent.putExtra("Keyword",name);
                            startActivity(intent);
                        }
                    });



    }
}