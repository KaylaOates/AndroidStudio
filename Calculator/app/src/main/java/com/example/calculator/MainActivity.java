package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.RatingBar;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    String displayAnswer = "0";

    public void onClick(View view)
    {

        if(displayAnswer.equals("0")) {
            displayAnswer = "";
        }

        if(view.getId() == R.id.AC) {
            displayAnswer = "0";
        } else if(view.getId() == R.id.One) {
            displayAnswer += "1";
        } else if(view.getId() == R.id.Two) {
            displayAnswer += "2";
        } else if(view.getId() == R.id.Three) {
            displayAnswer += "3";
        } else if(view.getId() == R.id.Four) {
            displayAnswer += "4";
        } else if(view.getId() == R.id.Five) {
            displayAnswer += "5";
        } else if(view.getId() == R.id.Six) {
            displayAnswer += "6";
        } else if(view.getId() == R.id.Seven) {
            displayAnswer += "7";
        } else if(view.getId() == R.id.Eight) {
            displayAnswer += "8";
        } else if(view.getId() == R.id.Nine) {
            displayAnswer += "9";
        } else if(view.getId() == R.id.Zero) {
            displayAnswer += "0";
        }

        TextView ans = findViewById(R.id.Answer);
        ans.setText(displayAnswer);

    }

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}