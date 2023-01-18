package com.example.offline_project1.adpter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.offline_project1.R;
import com.example.offline_project1.activity.DataList;
import com.example.offline_project1.config;

import java.util.ArrayList;

public class adpter3 extends BaseAdapter {
    DataList dataList;
    ArrayList id,name,value;
    public adpter3(DataList dataList, ArrayList nutrition_id, ArrayList nutrition_name, ArrayList daily_values) {
    this.id = nutrition_id;
    this.dataList = dataList;
    this.value = daily_values;
    this.name = nutrition_name ;
    }

    @Override
    public int getCount() {
        return id.size();
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

        view = LayoutInflater.from(dataList).inflate(R.layout.item3,viewGroup,false);

        TextView textView = view.findViewById(R.id.textview);
        TextView textView1 = view.findViewById(R.id.textview1);
        TextView textView2 = view.findViewById(R.id.textview2);

        textView.setText(id.get(i).toString());
        textView1.setText(name.get(i).toString());
        textView2.setText(value.get(i) == null ? "Null" : value.get(i).toString());

        return view;
    }
}
