package com.example.td2;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private ArrayList<Chien> chienList;
    private ListView listView;
    private MyAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listView = findViewById(R.id.list_dog);

        chienList = new ArrayList<>();
        chienList.add(new Chien("aktor", "Aktor", "Berger Allemand", "Allmange"));
        chienList.add(new Chien("danko", "Danko", "Bouledogue Anglais", "Angleterre"));
        chienList.add(new Chien("max", "Max", "Dalmatien", "Croatie"));

        adapter = new MyAdapter(this, chienList);
        listView.setAdapter(adapter);

        listView.setOnItemClickListener((parent, view, position, id) -> {
            Chien selectedChien = chienList.get(position);

            Intent intent = new Intent(MainActivity.this, InfoActivity.class);
            intent.putExtra("imageName", selectedChien.getImage());
            intent.putExtra("name", selectedChien.getName());
            intent.putExtra("race", selectedChien.getRace());
            intent.putExtra("origin", selectedChien.getOrigin());

            startActivity(intent);
        });
    }
}
