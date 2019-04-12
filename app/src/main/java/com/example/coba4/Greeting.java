package com.example.coba4;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class Greeting extends AppCompatActivity {
    private RecyclerView list_item;
    private android.support.v7.widget.LinearLayoutManager LinearLayoutManager;
    private List<GreetingObject> itemObjects;
    private AdapterItem adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_greeting);

        getSupportActionBar().setTitle("Japan-ku");

        /*casting variable*/
        list_item = (RecyclerView) findViewById(R.id.lst_item);

        /*memasukkan layout ini ke recyclerView*/
        LinearLayoutManager = new LinearLayoutManager(this);
        list_item.setLayoutManager(LinearLayoutManager);


        itemObjects = new ArrayList<>();
        itemObjects.add(new GreetingObject("HALO", "KON'NICHIWA"));
        itemObjects.add(new GreetingObject("SELAMAT PAGI", "OHAYO"));
        itemObjects.add(new GreetingObject("SELAMAT MALAM", "KONBAWA"));
        itemObjects.add(new GreetingObject("SELAMAT SIANG", "KON'NICHIWA"));
        itemObjects.add(new GreetingObject("APA KABAR", "OGENKIDESUKA"));
        itemObjects.add(new GreetingObject("SAYA", "WATASHIWA"));
        itemObjects.add(new GreetingObject("KAMU", "ANATAWA"));
        itemObjects.add(new GreetingObject("KITA", "WATASHITACHI"));
        /*membuat adapter*/
        adapter = new AdapterItem(getApplicationContext(), itemObjects);
        /*masukkan ke recyclerview*/
        list_item.setAdapter(adapter);

    }

    public void next(View view) {
        Intent j = new Intent(Greeting.this, BiodataActivity.class);
        startActivity(j);
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menucoba, menu);
        //getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;

    }

    public boolean onOptionsItemSelected(MenuItem item) {
        if (item.getItemId() == R.id.logout) {
            startActivity(new Intent(this, LoginActivity.class));
            Toast.makeText(getBaseContext(), "Logout sukses", Toast.LENGTH_LONG).show();

        }
        return true;
    }
}