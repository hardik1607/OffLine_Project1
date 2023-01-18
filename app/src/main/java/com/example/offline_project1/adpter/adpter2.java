package com.example.offline_project1.adpter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.offline_project1.activity.MainActivity3;
import com.example.offline_project1.R;
import com.example.offline_project1.config;


public class adpter2 extends BaseAdapter {
    MainActivity3 mainActivity3;
    public adpter2(MainActivity3 mainActivity3) {
    this.mainActivity3 = mainActivity3;
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

        view = LayoutInflater.from(mainActivity3).inflate(R.layout.item2,viewGroup,false);
        ImageView imageView = view.findViewById(R.id.img3);
        TextView textView = view.findViewById(R.id.text3);

        imageView.setImageResource(config.all_pizza_recipes_img1[i]);
        textView.setText(config.all_pizza_recipes_name1[i]);
        return view;
    }
}
