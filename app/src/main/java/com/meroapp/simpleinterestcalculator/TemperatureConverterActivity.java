package com.meroapp.simpleinterestcalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Toast;

public class TemperatureConverterActivity extends AppCompatActivity {

    private EditText etInput;
    private Button
            rbFarToCel, rbCelToFar;
    int input, results;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_temperature_converter);

        etInput = findViewById(R.id.etInput);
        rbFarToCel = findViewById(R.id.rbFarToCel);
        rbCelToFar = findViewById(R.id.rbCelToFar);

        rbFarToCel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                input = Integer.parseInt(etInput.getText().toString());
                results = (input - 32) / 32;

                Toast.makeText(TemperatureConverterActivity.this, "Value in Celcius is : " + results, Toast.LENGTH_LONG).show();
            }
        });

        rbCelToFar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                input = Integer.parseInt(etInput.getText().toString());
                results = (int) (9 / 5.0 * input + 32);

                Toast.makeText(TemperatureConverterActivity.this, "Value in Farenheight is : " + results, Toast.LENGTH_LONG).show();
            }
        });
    }
}
