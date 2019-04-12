package com.example.coba4;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


import com.bumptech.glide.Glide;

import java.util.List;


public class AdapterItem extends RecyclerView.Adapter<Holder>{

    Context context;
    List<GreetingObject> itemObjects;

    public AdapterItem(Context context, List<GreetingObject> itemObjects) {
        this.context = context;
        this.itemObjects = itemObjects;
    }

    @Override
    public Holder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.greeting_activity, null);
        Holder holderItem=new Holder(view);
        return holderItem;
    }

    @Override
    public void onBindViewHolder(@NonNull Holder holder, int position) {
        holder.txt_judul.setText(itemObjects.get(position).indonesia);
        holder.txt_harga.setText(itemObjects.get(position).jepang);
        Glide.with(context)
                .load(itemObjects.get(position))
                .into(holder.img_icon);
    }

    @Override
    public int getItemCount() {
        return itemObjects.size();

    }
}
