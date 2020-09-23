package com.example.geoattendencedemo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class WorkerMessageActivity extends AppCompatActivity {

    private Button confirmButton,rejectButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_worker_message);

        confirmButton=findViewById(R.id.ConfirmJobBtnID);
        rejectButton=findViewById(R.id.RejectJobBtnID);

        confirmButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent confirmJobActivityIntent = new Intent(WorkerMessageActivity.this, ConfirmJobActivity.class);
                startActivity(confirmJobActivityIntent);
            }
        });

        rejectButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent rejectJobActivityIntent = new Intent(WorkerMessageActivity.this, RejectJobActivity.class);
                startActivity(rejectJobActivityIntent);
            }
        });
    }
}