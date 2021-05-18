package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

public class TrainListActivity extends AppCompatActivity {

    ListView listView;
    String[] tName = {"Durantho Express","East-Coast Express","Garibrath Express","Shalimar Express","Shatabdi Express"};
    int[] price = {400,250,350,450,500};
    Integer[] imgId = {R.drawable.train_list,R.drawable.train_list,R.drawable.train_list,R.drawable.train_list,R.drawable.train_list};
    String[] time={"2:00 - 10:00","15:30 - 23:30","8:00 - 17:00","2:30 - 11:45","12:15 - 20:45"};
    int[] seats = {35,40,12,32,56};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_train_list);

        MyAdapter adapter = new MyAdapter(this,tName,price,imgId,time,seats);
        listView = findViewById(R.id.list);
        listView.setAdapter(adapter);
        listView.setOnItemClickListener((parent, view, position, id) -> {
            Intent intent = new Intent(getApplicationContext(),DynamicActivity.class);
            intent.putExtra("name",tName[position]);
            startActivity(intent);


        });
    }
}