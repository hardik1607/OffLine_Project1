package com.example.offline_project1.activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;

import android.Manifest;
import android.annotation.SuppressLint;
import android.content.pm.PackageManager;
import android.database.Cursor;
import android.os.Bundle;
import android.widget.ListView;
import android.widget.Toast;

import com.example.offline_project1.DataBaseHelper;
import com.example.offline_project1.R;
import com.example.offline_project1.adpter.adpter3;

import java.util.ArrayList;

public class DataList extends AppCompatActivity {

    ListView  listView;
    ArrayList nutrition_id,nutrition_name,daily_values;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_data_list);

        nutrition_id = new ArrayList();
        nutrition_name = new ArrayList();
        daily_values= new ArrayList();
        listView = findViewById(R.id.list);
        ActivityCompat.requestPermissions(DataList.this, new String[]{Manifest.permission.READ_EXTERNAL_STORAGE, Manifest.permission.WRITE_EXTERNAL_STORAGE},
                1);

        DataBaseHelper dataBaseHelper = new DataBaseHelper(this);

        Cursor c = dataBaseHelper.nutrition();

            while (c.moveToNext()){
                nutrition_id.add(c.getInt(0));
                nutrition_name.add(c.getString(1));
                daily_values.add(c.getString(2));

            }
        adpter3 ad1 = new adpter3(this,nutrition_id,nutrition_name,daily_values);

        listView.setAdapter(ad1);

    }
    @Override
    public void onRequestPermissionsResult(int requestCode,
                                           String permissions[], int[] grantResults) {
        super.onRequestPermissionsResult(requestCode, permissions, grantResults);
        switch (requestCode) {
            case 1: {
                if (grantResults.length > 0
                        && grantResults[0] == PackageManager.PERMISSION_GRANTED
                        && grantResults[1] == PackageManager.PERMISSION_GRANTED) {
                } else {
                    ActivityCompat.requestPermissions(DataList.this, new String[]{Manifest.permission.READ_EXTERNAL_STORAGE, Manifest.permission.WRITE_EXTERNAL_STORAGE},
                            1);
                    Toast.makeText(DataList.this, "Permission denied to read your External storage", Toast.LENGTH_SHORT).show();
                }
                return;
            }
        }
    }
}