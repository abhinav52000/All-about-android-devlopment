package com.devveloper.myapplicationcode;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.LinearLayoutCompat;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Spinner;


public class MainActivity extends AppCompatActivity {
    RadioGroup radioGroup;
    RadioButton red1,yellow1,green1;
    ArrayAdapter adapter;
    Spinner spinner;
    LinearLayoutCompat linear;

    Button ok;
                @Override
                protected void onCreate(Bundle savedInstanceState) {
                    super.onCreate(savedInstanceState);
                    setContentView(R.layout.activity_main);

                    radioGroup=findViewById(R.id.buttonid);
                    red1=findViewById(R.id.red);
                    yellow1=findViewById(R.id.yellow);
                    green1=findViewById(R.id.green);
                    linear=findViewById(R.id.layoutme);
                    ok=findViewById(R.id.button);
                    ok.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            if(green1.isChecked())
                            {

                                    linear.setBackgroundColor(Color.GREEN);
                            }
                            else if(red1.isChecked())
                            {

                                    linear.setBackgroundColor(Color.RED);
                            }
                            else if(yellow1.isChecked())
                            {

                                    linear.setBackgroundColor(Color.YELLOW);
                            }
                        }
                    });




                }
            }