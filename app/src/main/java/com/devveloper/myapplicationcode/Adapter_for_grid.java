package com.devveloper.myapplicationcode;

import android.annotation.SuppressLint;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class Adapter_for_grid extends BaseAdapter {


    ArrayList<String> text;
    ArrayList<Integer> image;
    Context context;


    public Adapter_for_grid(Context context,ArrayList<String> text,ArrayList<Integer>image){

        this.context=context;
        this.text=text;
        this.image=image;

    }

    @Override
    public int getCount() {
        return text.size();
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {


        @SuppressLint("ViewHolder") View view2= LayoutInflater.from(viewGroup.getContext())
                .inflate(R.layout.grid_view_layout,viewGroup,false);


        ImageView imageView=view2.findViewById(R.id.imageView);
        TextView textView=view2.findViewById(R.id.textView2);


        textView.setText(text.get(i));
        imageView.setImageResource(image.get(i));
        String string=text.get(i);

        //this above is alternative of new onclicklistner ka

        return view2;
    }
}
