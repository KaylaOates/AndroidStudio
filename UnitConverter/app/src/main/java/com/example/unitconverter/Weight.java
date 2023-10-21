package com.example.unitconverter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;

public class Weight extends AppCompatActivity {

    String unitA;
    String unitB;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
    }

    public void onRadioButtonClickedA(View view) {

        boolean checked = ((RadioButton) view).isChecked();
        if(view.getId() == R.id.ounceA && checked) {
            unitA = "ounce";
        } else if(view.getId() == R.id.poundA && checked) {
            unitA = "pound";
        } else if(view.getId() == R.id.gramA && checked) {
            unitA = "gram";
        }

        TextView output = findViewById(R.id.LengthB);
        output.setText("");
    }

    public void onRadioButtonClickedB(View view) {

        boolean checked = ((RadioButton) view).isChecked();
        if(view.getId() == R.id.ounceB && checked) {
            unitB = "ounce";
        } else if(view.getId() == R.id.poundB && checked) {
            unitB = "pound";
        } else if(view.getId() == R.id.gramB && checked) {
            unitB = "gram";
        }

        TextView output = findViewById(R.id.LengthB);
        output.setText("");
    }

    public void onEnter(View view) {
        EditText input = (EditText) findViewById(R.id.LengthA);

        String inputString = input.getText().toString();
        double inputValue = Double.parseDouble(inputString);

        String outputString = "";

        if(unitA.equals("ounce")) {
            if(unitB.equals("ounce")) {
                outputString = inputString + " oz";
            } else if(unitB.equals("pound")) {
                outputString = String.valueOf(inputValue * 0.0625) + " lb";
            } else if(unitB.equals("gram")) {
                outputString = String.valueOf(inputValue * 28.35) + " g";
            } else {
                outputString = "";
            }
        } else if(unitA.equals("pound")) {
            if(unitB.equals("pound")) {
                outputString = inputString + " lb";
            } else if(unitB.equals("ounce")) {
                outputString = String.valueOf(inputValue * 16) + " oz";
            } else if(unitB.equals("gram")) {
                outputString = String.valueOf(inputValue * 453.592) + " g";
            } else {
                outputString = "";
            }
        } else if(unitA.equals("gram")) {
            if(unitB.equals("gram")) {
                outputString = inputString + " g";
            } else if(unitB.equals("ounce")) {
                outputString = String.valueOf(inputValue * 0.0353) + " oz";
            } else if(unitB.equals("pound")) {
                outputString = String.valueOf(inputValue * 0.0022) + " lb";
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