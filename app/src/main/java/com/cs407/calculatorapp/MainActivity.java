package com.cs407.calculatorapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    public EditText input1, input2;
    double num1, num2;

    public boolean getNums(){
        input1 = (EditText) findViewById(R.id.integer1);
        input2 = (EditText) findViewById(R.id.integer2);

        String int1 = input1.getText().toString();
        String int2 = input2.getText().toString();

        num1 = Double.parseDouble(int1);
        num2 = Double.parseDouble(int2);
        return true;
    }

    public void addFunction(View view){
        if(getNums()) {
            double sum = num1 + num2;
            goToActivity(sum);
        }
    }

    public void subtractFunction(View view){
        if(getNums()) {
            double sum = num1 - num2;
            goToActivity(sum);
        }
    }

    public void multiplyFunction(View view){
        if(getNums()) {
            double sum = num1 * num2;
            goToActivity(sum);
        }
    }

    public void divideFunction(View view){
        if(getNums()) {
            if(num2 == 0){
                new Error("Cannot divide by 0");
                goToError();
            }
            else{
                double sum = num1/num2;
                goToActivity(sum);
            }
        }
    }


    public void goToActivity(Double d){
        Intent intent = new Intent (this, CalculatedTotal.class);
        intent.putExtra("sum",d);
        startActivity(intent);

    }

    public void goToError(){
        Intent intent = new Intent (this, ZeroError.class);
        startActivity(intent);
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}