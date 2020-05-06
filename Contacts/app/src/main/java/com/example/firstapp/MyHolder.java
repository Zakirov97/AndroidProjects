package com.example.firstapp;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class MyHolder extends RecyclerView.ViewHolder implements View.OnClickListener {
    public TextView name;
    RecycleClickListener listener;

    public MyHolder(@NonNull View itemView) {
        super(itemView);
        name = itemView.findViewById(R.id.name);
    }

    public MyHolder(@NonNull View itemView, RecycleClickListener listener) {
        super(itemView);
        name = itemView.findViewById(R.id.name);
        this.listener = listener;

        itemView.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        listener.OnClick(getAdapterPosition());
    }
}
