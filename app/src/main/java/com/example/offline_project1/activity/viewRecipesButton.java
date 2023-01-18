package com.example.offline_project1.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.widget.GridView;

import com.example.offline_project1.R;
import com.example.offline_project1.adpter.viewRecipesButtonAdpter;

public class viewRecipesButton extends AppCompatActivity {


    GridView grid_all_recipes;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view_recipes_button);

        grid_all_recipes = findViewById(R.id.grid_all_recipes);

        viewRecipesButtonAdpter viewRecipesButtonAdpter = new viewRecipesButtonAdpter(this);
        grid_all_recipes.setAdapter(viewRecipesButtonAdpter);
    }
}