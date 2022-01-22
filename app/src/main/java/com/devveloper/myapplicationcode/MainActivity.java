package com.devveloper.myapplicationcode;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {

    TextView result;
    Spinner spinner;
    ArrayAdapter adapter;

                @Override
                protected void onCreate(Bundle savedInstanceState) {
                    super.onCreate(savedInstanceState);
                    setContentView(R.layout.activity_main);


                    adapter=ArrayAdapter.createFromResource(this, R.array.country,
                            android.R.layout.simple_spinner_item);
                    spinner=findViewById(R.id.spinnere);
                    result=findViewById(R.id.resulte);
                    adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                    spinner.setAdapter(adapter);
                    spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                        @Override
                        public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                            String name= adapterView.getItemAtPosition(i).toString();
                            if(i==0)
                                Toast.makeText(getApplicationContext(),"Select Country First",Toast.LENGTH_LONG).show();
                            else
                                result.setText(name);
                        }
                        @Override
                        public void onNothingSelected(AdapterView<?> adapterView) {
                                result.setText("Select Your Country");
                        }
                    });

                }
            }