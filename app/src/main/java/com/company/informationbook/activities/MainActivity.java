package com.company.informationbook.activities;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.company.informationbook.adapters.AdapterClass;
import com.company.informationbook.ModelClass;
import com.company.informationbook.R;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    RecyclerView recyclerView;
    ArrayList<ModelClass> arrayList;

    AdapterClass adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setTitle("Information Book");

        recyclerView = findViewById(R.id.recyclerView);
        recyclerView.setLayoutManager(new GridLayoutManager(this,1));

        ModelClass modelClass1 = new ModelClass("The Countries","countries");
        ModelClass modelClass2 = new ModelClass("The Leaders","leaders");
        ModelClass modelClass3 = new ModelClass("The Museum","museums");
        ModelClass modelClass4 = new ModelClass("Wonders of the World","wonders");

        arrayList = new ArrayList<>();
        arrayList.add(modelClass1);
        arrayList.add(modelClass2);
        arrayList.add(modelClass3);
        arrayList.add(modelClass4);

        adapter = new AdapterClass(arrayList,this);
        recyclerView.setAdapter(adapter);

    }
}