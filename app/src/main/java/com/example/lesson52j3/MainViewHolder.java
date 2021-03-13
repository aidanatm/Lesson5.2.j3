package com.example.lesson52j3;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class MainViewHolder extends RecyclerView.ViewHolder {

    TextView text;
    ImageView image;
    public MainViewHolder(@NonNull View itemView) {
        super(itemView);

        text = itemView.findViewById(R.id.text1);
        text = itemView.findViewById(R.id.text2);
        image = itemView.findViewById(R.id.img);

    }

    public void onBind(ItemModel data){
        text.setText(data.text1);
        text.setText(data.text2);
        image.setImageResource(data.image);

    }
}
