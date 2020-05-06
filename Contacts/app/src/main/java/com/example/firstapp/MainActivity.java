package com.example.firstapp;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.os.Handler;
import android.util.Log;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity implements RecycleClickListener {

    private RecyclerView recyclerView;
    public static MyAdapter adapter;

    public static List<Contact> contacts = new ArrayList<Contact>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        contacts.add(new Contact("Альтаир", "ибн Ла-Ахад", "87771231231", "some@gmail.com"));
        contacts.add(new Contact("Эцио", "Аудиторе", "87771231231", "some@gmail.com"));
        contacts.add(new Contact("Радунхагейду", "1", "87771231231", "some@gmail.com"));
        contacts.add(new Contact("Эдвард", "Кэнуэй", "87771231231", "some@gmail.com"));
        contacts.add(new Contact("Авелина", "де Гранпре", "87771231231", "some@gmail.com"));
        contacts.add(new Contact("Арно", "Виктор", "87771231231", "some@gmail.com"));
        contacts.add(new Contact("Шэй", "Патрик", "87771231231", "some@gmail.com"));
        contacts.add(new Contact("Шао", "Дзюнь", "87771231231", "some@gmail.com"));
        contacts.add(new Contact("Арбааз", "Мир", "87771231231", "some@gmail.com"));
        contacts.add(new Contact("Николай", "Орлов", "87771231231", "some@gmail.com"));
        contacts.add(new Contact("Джейкоб", "Фрай", "87771231231", "some@gmail.com"));
        contacts.add(new Contact("Иви", "Фрай", "87771231231", "some@gmail.com"));
        contacts.add(new Contact("Байек", "из Сивы", "87771231231", "some@gmail.com"));
        contacts.add(new Contact("Кассандра", "1", "87771231231", "some@gmail.com"));

        recyclerView = findViewById(R.id.mainrecycler);
        LinearLayoutManager manager = new LinearLayoutManager(getApplicationContext());
        recyclerView.setLayoutManager(manager);
        adapter = new MyAdapter(contacts, this);
        recyclerView.setAdapter(adapter);

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        Intent intent;
        switch (item.getItemId()) {
            case R.id.exit:
                finish();
                return true;
            case R.id.settings:
                intent = new Intent(this, SettingsActivity.class);
                startActivity(intent);
                return true;
            case R.id.add_contact:
                intent = new Intent(this, AddContactActivity.class);
                startActivity(intent);
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }

    @Override
    public void OnClick(int position) {
        Intent intent = new Intent(this, ContactView.class);
        intent.putExtra(Contact.class.getSimpleName(), contacts.get(position));
        startActivity(intent);
    }
}
