package com.devveloper.myapplicationcode;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.LinearLayoutCompat;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.snackbar.Snackbar;


public class MainActivity extends AppCompatActivity {

    TextView result;
    Spinner spinner;
    ArrayAdapter adapter;
    LinearLayoutCompat linear;
                @Override
                protected void onCreate(Bundle savedInstanceState) {
                    super.onCreate(savedInstanceState);
                    setContentView(R.layout.activity_main);


                    adapter=ArrayAdapter.createFromResource(this, R.array.country,
                            android.R.layout.simple_spinner_item);
                    spinner=findViewById(R.id.spinnere);
                    result=findViewById(R.id.resulte);
                    linear=findViewById(R.id.layoutme);
                    adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                    spinner.setAdapter(adapter);
                    spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                        @Override
                        public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                            String name= adapterView.getItemAtPosition(i).toString();
                            if(i==0)
                            {
                                Snackbar.make(linear,"Hey it seems you have not selected anything",Snackbar.LENGTH_INDEFINITE).setAction("x", new View.OnClickListener() {
                                    @Override
                                    public void onClick(View view) {

                                    }
                                }).show();
                            }
//                                Snackbar.make(linear, "Hey it seems you have not selected anything",Snackbar.LENGTH_LONG).show();
//                                This is used inside if clause above when you are only doing it for small time or a bit more long time but you want to show your message for long then.
//                            In short it is an alterantive of toast as well.
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