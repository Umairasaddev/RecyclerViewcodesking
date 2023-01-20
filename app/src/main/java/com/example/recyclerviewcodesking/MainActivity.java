package com.example.recyclerviewcodesking;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements RecyclerViewInterface {


    RecyclerView recyclerView;
    RecyclerAdapter adapter;



    String monthNames[] = {"January", "Febuary", "March", "April", "May", "June", "July",
            "August", "September", "October", "November", "December",
            "January", "Febuary", "March", "April", "May", "June", "July",
            "August", "September", "October", "November", "December"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.recyclerview);

        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        adapter = new RecyclerAdapter(this, monthNames,this);
        recyclerView.setAdapter(adapter);


    }

    @Override
    public void onItemClick(int position) {


        Toast.makeText(this, "Clicked on "+monthNames[position], Toast.LENGTH_SHORT).show();

    }
}