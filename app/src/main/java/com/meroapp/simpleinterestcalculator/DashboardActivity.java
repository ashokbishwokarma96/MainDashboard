package com.meroapp.simpleinterestcalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class DashboardActivity extends AppCompatActivity implements View.OnClickListener {

    private Button buttonTempConverter,buttonSimpIntConverter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard);


        buttonTempConverter = findViewById(R.id.buttonTempConverter);
        buttonSimpIntConverter = findViewById(R.id.buttonSimpIntConverter);

        buttonTempConverter.setOnClickListener(this);
        buttonSimpIntConverter.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {

        if(view.getId() == R.id.buttonTempConverter){

            Intent intent =new Intent(DashboardActivity.this,TemperatureConverterActivity.class);
            startActivity(intent);
        }else{
            Intent intent = new Intent(DashboardActivity.this,MainActivity.class);
            startActivity(intent);
        }
    }
}
