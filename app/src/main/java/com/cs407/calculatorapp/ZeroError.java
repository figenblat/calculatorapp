package com.cs407.calculatorapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class ZeroError extends AppCompatActivity {

    TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.zero_error);
        textView=(TextView) findViewById(R.id.textView);
        Intent intent = getIntent();
        textView.setText("Error: Cannot divide by zero!");
    }
}