package com.example.firstapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class AddContactActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.add_contact_activity);

        Button btn_add_contact = findViewById(R.id.btn_add_contact);
        btn_add_contact.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                addContact();
            }
        });
    }

    public void addContact() {
        String name = ((TextView) findViewById(R.id.name)).getText().toString();
        String surname = ((TextView) findViewById(R.id.surname)).getText().toString();
        String phone = ((TextView) findViewById(R.id.phone)).getText().toString();
        String email = ((TextView) findViewById(R.id.email)).getText().toString();

        if ((!name.isEmpty() && !phone.isEmpty())) {
            MainActivity.contacts.add(new Contact(name, surname, phone, email));
            MainActivity.adapter.notifyDataSetChanged();
            finish();
        } else {
            if (name.isEmpty())
                (findViewById(R.id.name_warn)).setVisibility(View.VISIBLE);
            else
                (findViewById(R.id.name_warn)).setVisibility(View.INVISIBLE);

            if (phone.isEmpty())
                findViewById(R.id.ph_warn).setVisibility(View.VISIBLE);
            else
                findViewById(R.id.ph_warn).setVisibility(View.INVISIBLE);
        }
    }
}
