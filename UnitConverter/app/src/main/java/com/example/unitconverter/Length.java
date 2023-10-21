package com.example.unitconverter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;

public class Length extends AppCompatActivity {

    String unitA;
    String unitB;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
    }

    public void onRadioButtonClickedA(View view) {

        boolean checked = ((RadioButton) view).isChecked();
        if(view.getId() == R.id.cmA && checked) {
            unitA = "cm";
        } else if(view.getId() == R.id.inA && checked) {
            unitA = "inch";
        } else if(view.getId() == R.id.ftA && checked) {
            unitA = "feet";
        }

        TextView output = findViewById(R.id.LengthB);
        output.setText("");
    }

    public void onRadioButtonClickedB(View view) {

        boolean checked = ((RadioButton) view).isChecked();
        if(view.getId() == R.id.cmB && checked) {
            unitB = "cm";
        } else if(view.getId() == R.id.inB && checked) {
            unitB = "inch";
        } else if(view.getId() == R.id.ftB && checked) {
            unitB = "feet";
        }

        TextView output = findViewById(R.id.LengthB);
        output.setText("");
    }

    public void onEnter(View view) {
        EditText input = (EditText) findViewById(R.id.LengthA);

        String inputString = input.getText().toString();
        double inputValue = Double.parseDouble(inputString);

        String outputString = "";

        if(unitA.equals("cm")) {
            if(unitB.equals("cm")) {
                outputString = inputString + " cm";
            } else if(unitB.equals("inch")) {
                outputString = String.valueOf(inputValue * 0.394) + " in";
            } else if(unitB.equals("feet")) {
                outputString = String.valueOf(inputValue * 0.0328084) + " ft";
            } else {
                outputString = "";
            }
        } else if(unitA.equals("inch")) {
            if(unitB.equals("inch")) {
                outputString = inputString + " in";
            } else if(unitB.equals("cm")) {
                outputString = String.valueOf(inputValue * 2.54) + " cm";
            } else if(unitB.equals("feet")) {
                outputString = String.valueOf(inputValue * 0.0833) + " ft";
            } else {
                outputString = "";
            }
        } else if(unitA.equals("feet")) {
            if(unitB.equals("feet")) {
                outputString = inputString + " feet";
            } else if(unitB.equals("cm")) {
                outputString = String.valueOf(inputValue * 30.48) + " cm";
            } else if(unitB.equals("inch")) {
                outputString = String.valueOf(inputValue * 12) + " in";
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