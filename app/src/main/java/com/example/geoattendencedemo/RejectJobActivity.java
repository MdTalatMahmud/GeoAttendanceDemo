package com.example.geoattendencedemo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class RejectJobActivity extends AppCompatActivity {

    private Button seeNextDayRoasterButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reject_job);

        seeNextDayRoasterButton=findViewById(R.id.SeeRoasterBtnID);
        seeNextDayRoasterButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(RejectJobActivity.this, NextDayRoasterActivity.class);
                startActivity(intent);
            }
        });
    }
}