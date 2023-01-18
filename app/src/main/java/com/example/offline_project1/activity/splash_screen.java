package com.example.offline_project1.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

import com.example.offline_project1.R;

public class splash_screen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.splash_screen);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                // on below line we are
                // creating a new intent
                Intent i = new Intent(splash_screen.this, MainActivity.class);
                // on below line we are
                // starting a new activity.
                startActivity(i);
                // on the below line we are finishing
                // our current activity.
                finish();
            }
        }, 2000);

            }

}