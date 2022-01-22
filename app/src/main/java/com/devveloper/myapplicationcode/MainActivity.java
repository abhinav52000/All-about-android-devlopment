package com.devveloper.myapplicationcode;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.LinearLayoutCompat;

import android.app.Dialog;
import android.content.DialogInterface;
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
                            String name = adapterView.getItemAtPosition(i).toString();
                            if(i==0)
                                Toast.makeText(getApplicationContext(), "Please Select a country", Toast.LENGTH_SHORT).show();
                            else
                                showDialogMessage(name);
                        }
                        @Override
                        public void onNothingSelected(AdapterView<?> adapterView) {
                                result.setText("Select Your Country");
                        }
                    });

                }

    private void showDialogMessage(String name1) {
        AlertDialog.Builder alertdialog=new AlertDialog.Builder(this);
        alertdialog.setTitle("Confirm:").setMessage("You selected your country "+name1)
                .setNegativeButton("No", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int i) {
                        dialog.cancel();
                    }
                })
                .setPositiveButton("Yes", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int i) {
                        result.setText(name1);
                    }
                }).show();
        alertdialog.create();
    }
}