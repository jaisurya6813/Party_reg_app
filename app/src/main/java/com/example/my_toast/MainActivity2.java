package com.example.my_toast;

import android.os.Bundle;
import android.util.Log;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;


public class MainActivity2 extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_2);
        ImageView imageView = findViewById(R.id.Monki);
        imageView.setImageResource(R.drawable.party_lead);
        long NUM=getIntent().getLongExtra("num",0);
        String name=getIntent().getStringExtra("name");
        NUM=NUM%10000;
        String id = String.valueOf(NUM);
        String Party_ID=name.substring(0,3)+"@"+id;
        TextView tv = findViewById(R.id.ID);
        tv.setText("Member ID :  "+Party_ID);



    }
}
