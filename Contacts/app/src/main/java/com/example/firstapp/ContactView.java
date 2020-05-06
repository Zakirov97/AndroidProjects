package com.example.firstapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

public class ContactView extends AppCompatActivity {
    private static final String TAG = "ContactView";
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contact_view);

        Contact contact = (Contact) getIntent().getExtras().getSerializable(Contact.class.getSimpleName());
        ((TextView)findViewById(R.id.name)).setText(contact.getName());
        ((TextView)findViewById(R.id.surname)).setText(contact.getSurname());
        ((TextView)findViewById(R.id.phone)).setText(contact.getPhone());
        ((TextView)findViewById(R.id.email)).setText(contact.getEmail());
    }
}
