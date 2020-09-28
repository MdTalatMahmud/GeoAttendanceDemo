package com.example.geoattendencedemo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MakeNewDayRosterActivity extends AppCompatActivity {

    Button rosterAssignedButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_make_new_day_roster);

        rosterAssignedButton = findViewById(R.id.rosterAssignedButtonID);


    }

    public void showMessage(View view){
        if (view.getId() == R.id.rosterAssignedButtonID){
            Toast.makeText(MakeNewDayRosterActivity.this,"Your employee will be notified",Toast.LENGTH_SHORT).show();
        }
    }
}