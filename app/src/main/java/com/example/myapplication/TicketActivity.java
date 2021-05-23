package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

public class TicketActivity extends AppCompatActivity {

    ListView listView;
    String[] tName = {"Durantho Express","East-Coast Express","Garibrath Express","Shalimar Express","Shatabdi Express"};
    int[] price = {400,250,350,450,500};
    Integer[] imgId = {R.drawable.ticket,R.drawable.ticket,R.drawable.ticket,R.drawable.ticket,R.drawable.ticket};
    String[] time={"2:00 - 10:00","15:30 - 23:30","8:00 - 17:00","2:30 - 11:45","12:15 - 20:45"};
    int[] seats = {2,4,1,3,5};
    String[] date={"27/05/21","31/05/21","6/06/21","17/06/21","24/06/21"};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ticket);

        MyTicketAdapter adapter = new MyTicketAdapter(this,tName,price,imgId,time,seats,date);
        listView = findViewById(R.id.ticket_list);
        listView.setAdapter(adapter);
        listView.setOnItemClickListener((parent, view, position, id) -> {
            Intent intent = new Intent(getApplicationContext(),DynamicActivity.class);
            intent.putExtra("name",tName[position]);
            startActivity(intent);


        });
    }
}