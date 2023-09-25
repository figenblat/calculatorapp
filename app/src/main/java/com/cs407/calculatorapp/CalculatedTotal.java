package com.cs407.calculatorapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class CalculatedTotal extends AppCompatActivity {

    TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.calculated_total);
        textView=(TextView) findViewById(R.id.textView);
        Intent intent = getIntent();
        Double num = intent.getDoubleExtra("sum", 0);
        textView.setText("Total: " + num);
    }
}