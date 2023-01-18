package com.example.offline_project1.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import com.example.offline_project1.R;
import com.example.offline_project1.config;

public class MainActivity2 extends AppCompatActivity {

    ImageView imageView;
    Button button1,button2;
    int pos,a,position;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        pos = getIntent().getIntExtra("pos",0);
        a= getIntent().getIntExtra("a",0);
        position = getIntent().getIntExtra("position",0);
            imageView = findViewById(R.id.img2);
            button1 = findViewById(R.id.button1);
            button2 = findViewById(R.id.button2);

            if (a==1){
                imageView.setImageResource(config.all_pizza_recipes_img1[position]);
            }else{
                imageView.setImageResource(config.all_pizza_recipes_img1[position]);
            }

            button1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent intent = new Intent(MainActivity2.this,DataList.class);
                    startActivity(intent);
                }
            });
        }
}