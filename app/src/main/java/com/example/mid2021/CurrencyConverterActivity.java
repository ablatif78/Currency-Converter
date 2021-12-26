package com.example.mid2021;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import java.text.DecimalFormat;

public class CurrencyConverterActivity extends AppCompatActivity {
    Button button;
    TextView textView;
    String value;
    int checkedValue;
    double amount;

    DecimalFormat form = new DecimalFormat("0.00");

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_currency_converter);

        button = findViewById(R.id.buttonID1);
        textView = findViewById(R.id.textViewID1);

        Intent intent = getIntent();
        checkedValue = intent.getIntExtra("CURRENCY_GIVEN", 0);
        value = intent.getStringExtra("AMOUNT");
        amount = Double.parseDouble(value);

    }

    public void calculate(View view) {

        switch (checkedValue) {
            case 1: amount *= 85; break;
            case 2: amount *= 118; break;
            case 3: amount *= 101; break;
            default: amount = 0;
        }



        value = form.format(amount);
        String display = "Value in Desired Currency = " + value;
        textView.setText(display);
        amount = 0;
    }

    public void display(View view) {
        String info = "182-15-11375, Abdul Latif, latif15-11375@diu.edu.bd";
        Toast toast = Toast.makeText(this, info, Toast.LENGTH_SHORT);
        toast.setGravity(Gravity.CENTER, 0, 500);
        toast.show();
    }
}