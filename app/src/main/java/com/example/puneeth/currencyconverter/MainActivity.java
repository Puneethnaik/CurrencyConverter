package com.example.puneeth.currencyconverter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText currencyAmountEditText;
    public void convertCurrency(View view){
        switch(view.getId()){
            case R.id.convertButton:

                double currencyAmount = Double.parseDouble(currencyAmountEditText.getText().toString());
                currencyAmount *= 69.90;
                Toast.makeText(this, String.format("%.3f", currencyAmount) + " Rupees", Toast.LENGTH_LONG).show();
        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        currencyAmountEditText = findViewById(R.id.currencyAmount);

    }
}
