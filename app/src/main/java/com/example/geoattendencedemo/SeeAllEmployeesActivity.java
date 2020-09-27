package com.example.geoattendencedemo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.SearchView;
import android.widget.Toast;

public class SeeAllEmployeesActivity extends AppCompatActivity {

    ListView listView;
    private SearchView employeeSearchView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_see_all_employees);

        listView = findViewById(R.id.EmployeeListViewID);
        employeeSearchView = findViewById(R.id.employeeSearchViewID);

        final String[] employeeNames = getResources().getStringArray(R.array.employee_names);

        final ArrayAdapter<String> adapter = new ArrayAdapter<String>(SeeAllEmployeesActivity.this, R.layout.all_employee_view, R.id.textViewID, employeeNames);
        listView.setAdapter(adapter);

        employeeSearchView.setOnQueryTextListener(new SearchView.OnQueryTextListener() {
            @Override
            public boolean onQueryTextSubmit(String query) {
                return false;
            }

            @Override
            public boolean onQueryTextChange(String newText) {
                adapter.getFilter().filter(newText);
                return false;
            }
        });

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String value = employeeNames[position];
                Intent intent = new Intent(SeeAllEmployeesActivity.this, EmployeeHourRecordActivity.class);
                intent.putExtra("value", value);
                startActivity(intent);
            }
        });
    }
}