package com.example.offline_project1.adpter;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.offline_project1.R;
import com.example.offline_project1.activity.MainActivity;
import com.example.offline_project1.activity.MainActivity2;
import com.example.offline_project1.activity.MainActivity3;
import com.example.offline_project1.config;

import org.w3c.dom.Text;

public class adpter1 extends RecyclerView.Adapter<adpter1.myclass>{
    MainActivity mainActivity;

    public adpter1(MainActivity mainActivity) {
            this.mainActivity = mainActivity;
    }

    @NonNull
    @Override
    public myclass onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(mainActivity).inflate(R.layout.item1,parent,false);

        myclass m = new myclass(view);
        return m;
    }

    class myclass extends RecyclerView.ViewHolder{
        ImageView imageView;
        TextView textView;
        public myclass(@NonNull View itemView) {
            super(itemView);

            imageView = itemView.findViewById(R.id.img);
            textView = itemView.findViewById(R.id.text);
        }
    }

    @Override
    public void onBindViewHolder(@NonNull myclass holder, @SuppressLint("RecyclerView") int position1) {

        holder.imageView.setImageResource(config.first_pizzs_img[position1]);
        holder.textView.setText(config.frist_pizzs_name[position1]);

        holder.imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (position1 == 5){
                    Intent intent = new Intent(mainActivity, MainActivity3.class);
                    mainActivity.startActivity(intent);
                }else {
                    Intent intent = new Intent(mainActivity, MainActivity2.class);
                    intent.putExtra("pos", position1);
                    mainActivity.startActivity(intent);
                }
            }
        });

    }

    @Override
    public int getItemCount() {
        return config.first_pizzs_img.length;
    }
}