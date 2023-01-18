package com.example.offline_project1.adpter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.offline_project1.R;
import com.example.offline_project1.activity.MainActivity;
import com.example.offline_project1.config;

public class secound_list_adpter extends RecyclerView.Adapter<secound_list_adpter.myclass> {
    MainActivity mainActivity;
    public secound_list_adpter(MainActivity mainActivity) {
    this.mainActivity = mainActivity;
    }

    @NonNull
    @Override
    public myclass onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(mainActivity).inflate(R.layout.secound_list_item,parent,false);
        myclass m = new myclass(view);
        return m;
    }

    class myclass extends RecyclerView.ViewHolder{
        ImageView imageView;
        public myclass(@NonNull View itemView) {
            super(itemView);
            imageView = itemView.findViewById(R.id.img);
        }
    }

    @Override
    public void onBindViewHolder(@NonNull myclass holder, int position) {
        holder.imageView.setImageResource(config.secound_img[position]);
    }

    @Override
    public int getItemCount() {
        return config.secound_img.length;
    }
}
