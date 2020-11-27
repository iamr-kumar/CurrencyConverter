package com.example.testapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    public void convertCurrency(View view) {
        EditText dollarAmountEditText = (EditText) findViewById(R.id.dollarAmountEditText);
        Log.i("amount", dollarAmountEditText.getText().toString());
        Double dollarAmountDouble = Double.parseDouble(dollarAmountEditText.getText().toString());
        Double amountInRupees = dollarAmountDouble * 73.99;
        Toast.makeText(MainActivity.this, amountInRupees.toString(), Toast.LENGTH_SHORT).show();
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
