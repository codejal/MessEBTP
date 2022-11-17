package com.example.messe;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

public class CheckMenuActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_check_menu);
        Spinner workerCheckMenuSpinner = (Spinner) findViewById(R.id.checkMenuSpinner);
        ArrayAdapter<String> daysAdapter = new ArrayAdapter<>(CheckMenuActivity.this,
                android.R.layout.simple_list_item_1, getResources().getStringArray(R.array.days));
        daysAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        workerCheckMenuSpinner.setAdapter(daysAdapter);
    }
}