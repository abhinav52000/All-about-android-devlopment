package com.devveloper.myapplicationcode;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView sapna;
    Button button1;
    EditText apna;
    ImageView dekh;
    String me="Abhinav",check;
    int count=0;
    @SuppressLint("ResourceAsColor")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        apna=findViewById(R.id.namtera);
        sapna=findViewById(R.id.jwabmera);
        button1=findViewById(R.id.checkwla);
        dekh=findViewById(R.id.tasweer);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                check=apna.getText().toString();

                if(me.equals(check))
                {
                    sapna.setText("Permission granted");
                    dekh.setImageResource(R.drawable.img20211124021322);
                    count=0;
                }
                else
                {
                    if (count==5) {
                        sapna.setText("This IP is blocked");
                        System.exit(1);
                    }
                    sapna.setText("Try once again 😊"+count);
                    dekh.setImageResource(R.drawable.down);
                    ++count;
                }
            }

        });




    }
}