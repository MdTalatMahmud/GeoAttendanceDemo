package com.example.geoattendencedemo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class SupervisorActivity extends AppCompatActivity {

    Button todaysWorkerButton, seeAllEmployeesButton, makeNewDayRosterButton, seeFullMonthRosterActivityButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_supervisor);

        todaysWorkerButton = findViewById(R.id.TodaysWorkerBtnID);
        seeAllEmployeesButton = findViewById(R.id.SeeAllEmployeesBtnID);
        makeNewDayRosterButton = findViewById(R.id.MakeNewDayRosterBtnID);
        seeFullMonthRosterActivityButton = findViewById(R.id.SeeFullMonthRosterActivityBtnID);

        todaysWorkerButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(SupervisorActivity.this, TodaysWorkerActivity.class);
                startActivity(intent);
            }
        });

        seeAllEmployeesButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(SupervisorActivity.this, SeeAllEmployeesActivity.class );
                startActivity(intent);
            }
        });

        makeNewDayRosterButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(SupervisorActivity.this, MakeNewDayRosterActivity.class);
                startActivity(intent);
            }
        });

        seeFullMonthRosterActivityButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(SupervisorActivity.this, SeeFullMonthActivity.class);
                startActivity(intent);
            }
        });
    }
}