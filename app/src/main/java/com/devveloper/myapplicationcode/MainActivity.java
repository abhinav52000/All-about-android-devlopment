package com.devveloper.myapplicationcode;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.Toast;

import java.security.PublicKey;
import java.util.ArrayList;


public class MainActivity extends AppCompatActivity {


                GridView gridView1;
                ArrayList<String> text=new ArrayList<>();
                ArrayList<Integer> image = new ArrayList<>();


                @Override
                protected void onCreate(Bundle savedInstanceState) {
                    super.onCreate(savedInstanceState);
                    setContentView(R.layout.activity_main);

                    gridView1=findViewById(R.id.gridview);
                    fillArray();
                    Adapter_for_grid adapter_for_grid=new Adapter_for_grid(this, text, image);
                    gridView1.setAdapter(adapter_for_grid);
                    gridView1.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                        @Override
                        public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {

                                Toast.makeText(getApplicationContext(), "THIS IS "+text.get(i).toUpperCase(), Toast.LENGTH_SHORT).show();

                        }
                    });



    }

    public void fillArray()
    {

        text.add("Bird");
        text.add("cat");
        text.add("chicken");
        text.add("Dog");
        text.add("Fish");
        text.add("Monkey");
        text.add("Rabbit");
        text.add("Sheep");
        text.add("Lion");


        image.add(R.drawable.bird);
        image.add(R.drawable.cat);
        image.add(R.drawable.chicken);
        image.add(R.drawable.dog);
        image.add(R.drawable.fish);
        image.add(R.drawable.monkey);
        image.add(R.drawable.rabbit);
        image.add(R.drawable.sheep);
        image.add(R.drawable.lion);


    }
}