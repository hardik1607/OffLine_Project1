package com.example.offline_project1.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;

import com.example.offline_project1.R;
import com.example.offline_project1.adpter.adpter2;

public class MainActivity3 extends AppCompatActivity {

    GridView gridView;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        gridView = findViewById(R.id.grid1);

        adpter2 ad = new adpter2(this);
        gridView.setAdapter(ad);

        gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {

                Intent intent = new Intent(MainActivity3.this, MainActivity2.class);
                int a=1;
                intent.putExtra("a",a);
                intent.putExtra("position",i);
                startActivity(intent);
            }
        });
    }

}