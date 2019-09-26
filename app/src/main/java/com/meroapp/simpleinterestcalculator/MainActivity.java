package com.meroapp.simpleinterestcalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.card.MaterialCardView;

public class MainActivity extends AppCompatActivity {

    private EditText etPrincipal,etRate,etTime;
    private Button btnCalculateSimpleInterest;
    private TextView tvResults;
    int principal,rate,time,simpleInterest;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etPrincipal = findViewById(R.id.etPrincipal);
        etRate = findViewById(R.id.etRate);
        etTime = findViewById(R.id.etTime);
        btnCalculateSimpleInterest = findViewById(R.id.btnCalculateSimpleInterest);
        tvResults = findViewById(R.id.tvResults);


        btnCalculateSimpleInterest.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                principal = Integer.parseInt(etPrincipal.getText().toString());
                rate = Integer.parseInt(etRate.getText().toString());
                time = Integer.parseInt(etTime.getText().toString());
                simpleInterest = (principal*rate*time)/100;
                tvResults.setText("SimpleIntersest is: " +simpleInterest );

                //Toast.makeText(MainActivity.this, "SimpleInterest is : " + simpleInterest, Toast.LENGTH_LONG).show();


            }
        });


    }
}
