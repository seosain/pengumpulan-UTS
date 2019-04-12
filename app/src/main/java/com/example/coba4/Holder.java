package com.example.coba4;

import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;


public class Holder extends RecyclerView.ViewHolder {

    public TextView txt_judul, txt_harga;
    public ImageView img_icon;


    public Holder(View itemView) {
        super(itemView);

        txt_judul = (TextView) itemView.findViewById(R.id.txt_judul);
        txt_harga = (TextView) itemView.findViewById(R.id.txt_harga);
    }
}