package com.example.mid2021;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioGroup;

public class StartActivity extends AppCompatActivity {
    EditText editText;
    RadioGroup radioGroup;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editText = findViewById(R.id.editText1ID);
        radioGroup = findViewById(R.id.radioGroupID);
    }

    public void start(View view) {

        String amount = editText.getText().toString();
        int checked;
        if(radioGroup.getCheckedRadioButtonId() == R.id.radioButtonUSD) checked = 1;
        else if(radioGroup.getCheckedRadioButtonId() == R.id.radioButtonPound) checked = 2;
        else if(radioGroup.getCheckedRadioButtonId() == R.id.radioButtonEuro) checked = 3;
        else checked = 0;

        Intent intent = new Intent(StartActivity.this, CurrencyConverterActivity.class);
        intent.putExtra("CURRENCY_GIVEN", checked);
        intent.putExtra("AMOUNT", amount);
        startActivity(intent);

    }
}