package com.example.bmicalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    public void calculateBMI(View view) {
        // 1. read weight and height editTexts

        EditText editTextHeight = findViewById(R.id.editTextHeight);
        EditText editTextWeight = findViewById(R.id.editTextWeight);

        // 2. Read the input text as string (it's always string even though it has numbers only
        String heightString = editTextHeight.getText().toString();
        String weightString = editTextWeight.getText().toString();
        // 3. convert the texts in double
        double height = Double.parseDouble(heightString);
        double weight = Double.parseDouble(weightString);

        // 4. calculate the BMI = weight/(height/100*height/100)
        double BMI = weight/(height/100 * height/100);
        TextView bmiTextView = findViewById(R.id.bmiTextView);
        bmiTextView.setText(String.format("%.2f", BMI));


    }
}