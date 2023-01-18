package com.example.offline_project1.activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.offline_project1.R;
import com.example.offline_project1.adpter.adpter1;
import com.example.offline_project1.adpter.secound_list_adpter;
import com.example.offline_project1.adpter.viewRecipesButtonAdpter;

public class MainActivity extends AppCompatActivity {

    RecyclerView recyclerView,recycle ;
    Button btn_all;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.recyclerView);
        recycle = findViewById(R.id.recycle);
        btn_all = findViewById(R.id.btn_all);

        adpter1 ad = new adpter1(this);
        recyclerView.setAdapter(ad);

        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this,RecyclerView.HORIZONTAL,false);
        recyclerView.setLayoutManager(linearLayoutManager);

        secound_list_adpter sla = new secound_list_adpter(this);
        recycle.setAdapter(sla);

        LinearLayoutManager linearLayoutManager1 = new LinearLayoutManager(this,RecyclerView.HORIZONTAL,false);
        recycle.setLayoutManager(linearLayoutManager1);

        btn_all.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(MainActivity.this, viewRecipesButton.class);
                startActivity(intent);
            }
        });

    }

}