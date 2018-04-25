package com.gmosa.rerun;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;

import java.util.ArrayList;

public class Snack extends AppCompatActivity {
    GridView grid;
    CustomAdapter adapter;

    ArrayList<Item> data;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_snack);
        grid = findViewById(R.id.grid);
        data = new ArrayList<Item>();
        Item p1 = new Item("king",2009,"good",R.mipmap.aa);
        Item p2= new Item("king",2009,"good",R.mipmap.aa);
        Item p3 = new Item("king",2009,"good",R.mipmap.aa);

        data.add(p1);
        data.add(p2);
        data.add(p3);

        adapter = new CustomAdapter(this, data);
        grid.setAdapter(adapter);

    }
}
