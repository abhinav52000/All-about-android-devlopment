package com.devveloper.myapplicationcode;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {


                EditText editText,multiline;
                Button button;
                CheckBox checkBox;
                int count=0;
                String name,message;
                boolean ischecked;

                SharedPreferences sharedPreferences;

                @Override
                protected void onCreate(Bundle savedInstanceState) {
                    super.onCreate(savedInstanceState);
                    setContentView(R.layout.activity_main);

                    editText=findViewById(R.id.edittext);
                    button=findViewById(R.id.secondlink);
                    multiline=findViewById(R.id.editTextTextMultiLine2);
                    checkBox=findViewById(R.id.checkBox);

                    retrive_Data();
                    button.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            count+=1;
                            button.setText(""+count);
                        }
                    });
                    checkBox.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            if(checkBox.isChecked()){
                                saveData();
                            }

                        }
                    });

    }

    @Override
    protected void onPause() {

//                    saveData();
        //Generally data is saved in on pause method but maine naya try karne ko is check hai to save karne ka socha you may use it anywhere main chij is ki saveData() nethod and retrive_Data()method.
        super.onPause();
    }
    public void saveData(){
                     sharedPreferences=getSharedPreferences("saveData", Context.MODE_PRIVATE);
                     name=editText.getText().toString();
                     message=multiline.getText().toString();
                     if(checkBox.isChecked())
                     {
                         ischecked=true;
                     }
                     else{
                         ischecked=false;
                     }

                     SharedPreferences.Editor editor = sharedPreferences.edit();
                     editor.putString("name1",name);
                     editor.putString("message1",message);
                     editor.putBoolean("ischecked1",ischecked);
                     editor.putInt("count1",count);
                     editor.commit();
                     Toast.makeText(getApplicationContext(),R.string.toast, Toast.LENGTH_LONG).show();

    }
    public void retrive_Data(){
                    sharedPreferences=getSharedPreferences("saveData",MODE_PRIVATE);
                    name=sharedPreferences.getString("name1",null);
                    message=sharedPreferences.getString("message1",null);
                    count=sharedPreferences.getInt("count1",0);
                    ischecked=sharedPreferences.getBoolean("ischecked1",false);

                    editText.setText(name);
                    multiline.setText(message);
                    button.setText(""+count);
                    if(ischecked)
                    {
                        checkBox.setChecked(true);
                    }
                    else{
                        checkBox.setChecked(false);
                    }


    }
}