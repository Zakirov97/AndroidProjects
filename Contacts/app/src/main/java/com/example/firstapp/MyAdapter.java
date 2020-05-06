package com.example.firstapp;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class MyAdapter extends RecyclerView.Adapter<MyHolder> implements RecycleClickListener {
    private List<Contact> contacts;
    private RecycleClickListener listener;
    public MyAdapter(List<Contact> contacts){
        this.contacts = contacts;
    }
    public MyAdapter(List<Contact> contacts, RecycleClickListener listener){
        this.listener = listener;
        this.contacts = contacts;
    }
    @NonNull
    @Override
    public MyHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
       View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.contact, parent, false);
        return new MyHolder(v,listener);
    }

    @Override
    public void onBindViewHolder(@NonNull MyHolder holder, int position) {
        Contact contact = contacts.get(position);
        holder.name.setText(contact.getName() + " " + contact.getSurname());
    }

    @Override
    public int getItemCount() {
        return contacts.size();
    }

    @Override
    public void OnClick(int position) {

    }
}
