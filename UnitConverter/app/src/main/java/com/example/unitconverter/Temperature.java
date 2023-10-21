package com.example.unitconverter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;

public class Temperature extends AppCompatActivity {

    String unitA;
    String unitB;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);
    }

    public void onRadioButtonClickedA(View view) {

        boolean checked = ((RadioButton) view).isChecked();
        if(view.getId() == R.id.fahrenheitA && checked) {
            unitA = "far";
        } else if(view.getId() == R.id.celsiusA && checked) {
            unitA = "cel";
        } else if(view.getId() == R.id.kelvinA && checked) {
            unitA = "kel";
        }

        TextView output = findViewById(R.id.LengthB);
        output.setText("");
    }

    public void onRadioButtonClickedB(View view) {

        boolean checked = ((RadioButton) view).isChecked();
        if(view.getId() == R.id.fahrenheitB && checked) {
            unitB = "far";
        } else if(view.getId() == R.id.celsiusB && checked) {
            unitB = "cel";
        } else if(view.getId() == R.id.kelvinB && checked) {
            unitB = "kel";
        }

        TextView output = findViewById(R.id.LengthB);
        output.setText("");
    }

    public void onEnter(View view) {
        EditText input = (EditText) findViewById(R.id.LengthA);

        String inputString = input.getText().toString();
        double inputValue = Double.parseDouble(inputString);

        String outputString = "";

        if(unitA.equals("far")) {
            if(unitB.equals("far")) {
                outputString = inputString + " F";
            } else if(unitB.equals("cel")) {
                outputString = String.valueOf(((inputValue - 32)*(5/9))) + " C";
            } else if(unitB.equals("kel")) {
                outputString = String.valueOf((((inputValue-32)*(5/9))+273.15)) + " K";
            } else {
                outputString = "";
            }
        } else if(unitA.equals("cel")) {
            if(unitB.equals("cel")) {
                outputString = inputString + " C";
            } else if(unitB.equals("far")) {
                outputString = String.valueOf(((inputValue*(9/5))+32)) + " F";
            } else if(unitB.equals("kel")) {
                outputString = String.valueOf(inputValue + 273.15) + " K";
            } else {
                outputString = "";
            }
        } else if(unitA.equals("kel")) {
            if(unitB.equals("kel")) {
                outputString = inputString + " K";
            } else if(unitB.equals("far")) {
                outputString = String.valueOf(((inputValue-273.15)*(9/5))+32) + " F";
            } else if(unitB.equals("cel")) {
                outputString = String.valueOf(inputValue - 273.15) + " C";
            } else {
                outputString = "";
            }
        } else {
            outputString = "";
        }

        TextView output = findViewById(R.id.LengthB);
        if(outputString.length() > 6) {
            outputString = outputString.substring(0, 6);
        }
        output.setText(outputString);
    }
}