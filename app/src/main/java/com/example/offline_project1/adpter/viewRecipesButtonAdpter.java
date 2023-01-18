package com.example.offline_project1.adpter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.offline_project1.R;
import com.example.offline_project1.config;
import com.example.offline_project1.activity.viewRecipesButton;

public class viewRecipesButtonAdpter extends BaseAdapter {
    viewRecipesButton viewRecipesButton;
    public viewRecipesButtonAdpter(viewRecipesButton viewRecipesButton) {
    this.viewRecipesButton = viewRecipesButton;
    }

    @Override
    public int getCount() {
        return config.all_pizza_recipes_img1.length;
    }

    @Override
    public Object getItem(int i) {
        return i;
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        view = LayoutInflater.from(viewRecipesButton).inflate(R.layout.view_recipes_button_item,viewGroup,false);
        TextView textView = view.findViewById(R.id.view_recipes_text);
        ImageView imageView = view.findViewById(R.id.view_recipes_img);

        textView.setText(config.all_pizza_recipes_name1[i]);
        imageView.setImageResource(config.all_pizza_recipes_img1[i]);
        return view;
    }
}
