package com.company.informationbook.adapters;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import com.company.informationbook.ModelClass;
import com.company.informationbook.R;
import com.company.informationbook.activities.CountriesActivity;
import com.company.informationbook.activities.LeadersActivity;
import com.company.informationbook.activities.MuseumsActivity;
import com.company.informationbook.activities.WondersActivity;

import java.util.ArrayList;

public class AdapterClass extends RecyclerView.Adapter<AdapterClass.CardViewHolder>{

    private ArrayList <ModelClass> modelList;
    private Context context;

    public AdapterClass(ArrayList<ModelClass> modelList, Context context) {
        this.modelList = modelList;
        this.context = context;
    }

    @NonNull
    @Override
    public CardViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.card_design,parent,false);

        return new CardViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull CardViewHolder holder, int position) {

        ModelClass model = modelList.get(position);
        holder.textView.setText(model.getCategoryName());
        holder.imageView.setImageResource(context.getResources().getIdentifier(model.getImageName(),"drawable",context.getPackageName()));

        holder.cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(position == 0)
                {
                    Intent intent = new Intent(context, CountriesActivity.class);
                    context.startActivity(intent);
                }
                if(position == 1)
                {
                    Intent intent = new Intent(context, LeadersActivity.class);
                    context.startActivity(intent);
                }
                if(position == 2)
                {
                    Intent intent = new Intent(context, MuseumsActivity.class);
                    context.startActivity(intent);
                }
                if(position == 3)
                {
                    Intent intent = new Intent(context, WondersActivity.class);
                    context.startActivity(intent);
                }
            }
        });
    }

    @Override
    public int getItemCount() {
        return modelList.size();
    }

    public class CardViewHolder extends RecyclerView.ViewHolder{

        private ImageView imageView;
        private TextView textView;
        private CardView cardView;
        public CardViewHolder(@NonNull View itemView) {
            super(itemView);

            imageView = itemView.findViewById(R.id.imageView);
            textView = itemView.findViewById(R.id.textView);
            cardView = itemView.findViewById(R.id.cardView);
        }

    }

}
