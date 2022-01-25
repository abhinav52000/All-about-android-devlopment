package com.devveloper.myapplicationcode;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;


public class MainActivity extends AppCompatActivity {

                private RecyclerView recyclerView;
                private Adapter_Class adapter;

                private ArrayList<String>countrynamelist=new ArrayList<>();
                private ArrayList<String>detailslist=new ArrayList<>();
                private ArrayList<Integer> imagelist=new ArrayList<Integer>();


                @Override
                protected void onCreate(Bundle savedInstanceState) {
                    super.onCreate(savedInstanceState);
                    setContentView(R.layout.activity_main);

                    recyclerView=findViewById(R.id.recycleview);
                    recyclerView.setLayoutManager(new LinearLayoutManager(MainActivity.this));


                    countrynamelist.add("India");
                    countrynamelist.add("America");
                    countrynamelist.add("Russia");
                    countrynamelist.add("Germany");
                    countrynamelist.add("Izrael");

                    detailslist.add("This is th Indian Flag");
                    detailslist.add("This is American Flag");
                    detailslist.add("This is Russian Flag");
                    detailslist.add("This is Germany Flag");
                    detailslist.add("This is Izrael Flag");

                    imagelist.add(R.drawable.indian_flag);
                    imagelist.add(R.drawable.amricanflag);
                    imagelist.add(R.drawable.russianflag);
                    imagelist.add(R.drawable.germanflag);
                    imagelist.add(R.drawable.izrael_flag);

                    adapter=new Adapter_Class(countrynamelist,detailslist,imagelist,MainActivity.this);
                    recyclerView.setAdapter(adapter);


    }
}