package com.devveloper.myapplicationcode;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;



public class MainActivity extends AppCompatActivity {

    String countrylist[];
    ArrayAdapter<String> adapter;
    ListView listView;

                @Override
                protected void onCreate(Bundle savedInstanceState) {
                    super.onCreate(savedInstanceState);
                    setContentView(R.layout.activity_main);

                    listView=findViewById(R.id.list);
                    countrylist= getResources().getStringArray(R.array.country);
                    adapter=new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1,countrylist);
                    listView.setAdapter(adapter);
                    listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                        @Override
                        public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                            String name=adapterView.getItemAtPosition(i).toString();
                            if(name.equals(adapterView.getItemAtPosition(0).toString()))
                                Toast.makeText(getApplicationContext(), "SELECT A VALID CHOICE", Toast.LENGTH_LONG).show();
                            else
                                Toast.makeText(getApplicationContext(), "YOU SELECTED "+ name.toUpperCase(), Toast.LENGTH_SHORT).show();
                        }
                    });




    }
}