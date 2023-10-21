package com.example.unitconverter;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onLength(View view) {
        Intent myIntent = new Intent(getBaseContext(), Length.class);
        startActivity(myIntent);
    }

    public void onWeight(View view) {
        Intent myIntent = new Intent(getBaseContext(), Weight.class);
        startActivity(myIntent);
    }
    public void onTemperature(View view) {
        Intent myIntent = new Intent(getBaseContext(), Temperature.class);
        startActivity(myIntent);
    }
}