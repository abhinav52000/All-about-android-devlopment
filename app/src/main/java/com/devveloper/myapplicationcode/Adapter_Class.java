package com.devveloper.myapplicationcode;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class Adapter_Class extends RecyclerView.Adapter<Adapter_Class.countryViewHolder>{

    private ArrayList<String> countrynamelist;
    private ArrayList<String>detailslist;
    private ArrayList<Integer> imagelist;
    private Context context;

    public Adapter_Class(ArrayList<String> countrynamelist, ArrayList<String> detailslist, ArrayList<Integer> imagelist, Context context) {
        this.countrynamelist = countrynamelist;
        this.detailslist = detailslist;
        this.imagelist = imagelist;
        this.context = context;
    }

    @NonNull
    @Override
    public countryViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.card_design,parent,false);


        return new countryViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull countryViewHolder holder, int position) {


        holder.textViewcountrtyname.setText(countrynamelist.get(position));
        holder.textViewdetails.setText(detailslist.get(position));
        holder.imageView.setImageResource(imagelist.get(position));
        String printingname=countrynamelist.get(position).toString();
        holder.cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(context.getApplicationContext(), ("The card you selected is of "+printingname).toUpperCase(), Toast.LENGTH_SHORT).show();
            }
        });
    }

    @Override
    public int getItemCount() {

        return countrynamelist.size();
    }

    public class countryViewHolder extends RecyclerView.ViewHolder {

       private TextView textViewcountrtyname,textViewdetails;
       private ImageView imageView;
       private CardView cardView;

        public countryViewHolder(@NonNull View itemView) {
            super(itemView);
            imageView=itemView.findViewById(R.id.profile_image);
            textViewcountrtyname=itemView.findViewById(R.id.textView3);
            textViewdetails=itemView.findViewById(R.id.textView4);
            cardView=itemView.findViewById(R.id.cardviewhold);
        }
    }

}
