package com.example.myapplication;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

public class MyAdapter extends ArrayAdapter<String> {
    Activity activity;
    String[] tName;
    int[] price;
    Integer[] imgId;
    String[] time;
    int[] seats;

    public MyAdapter(Activity activity,String[] tName,int[] price,Integer[] imgId,String[] time,int[] seats) {
        super(activity,R.layout.list_train,tName);
        this.activity=activity;
        this.tName=tName;
        this.price=price;
        this.imgId=imgId;
        this.time=time;
        this.seats=seats;

    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View view, @NonNull ViewGroup parent) {
        LayoutInflater li = activity.getLayoutInflater();
        View row= li.inflate(R.layout.list_train,null,true);

        TextView title,berth,timings,cost;
        title = row.findViewById(R.id.trainName);
        berth=row.findViewById(R.id.seats);
        timings=row.findViewById(R.id.time);
        cost=row.findViewById(R.id.price);

        title.setText(tName[position]);
        berth.setText(String.valueOf(seats[position]));
        timings.setText(time[position]);
        cost.setText(String.valueOf(price[position]));

        return row;

    }
}
