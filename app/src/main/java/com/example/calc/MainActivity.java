package com.example.calc;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText numberA;
    private TextView textZnak;
    private EditText numberB;
    private TextView textRes;
    private Button buttonPlus;
    private Button buttonMinus;
    private Button buttonD;
    private Button buttonY;
    private Button buttonDelete;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        numberA=findViewById(R.id.numberA);
        textZnak=findViewById(R.id.textZnak);
        numberB=findViewById(R.id.numberB);
        textRes=findViewById(R.id.textRes);
        buttonPlus=findViewById(R.id.buttonPlus);
        buttonMinus=findViewById(R.id.buttonMinus);
        buttonD=findViewById(R.id.buttonD);
        buttonY=findViewById(R.id.buttonY);
        buttonDelete=findViewById(R.id.buttonDelete);

        buttonPlus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textZnak.setText("+");
            }
        });
        buttonMinus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textZnak.setText("-");
            }
        });
        buttonD.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textZnak.setText("/");
            }
        });
        buttonY.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textZnak.setText("*");
            }
        });
        buttonDelete.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textZnak.setText("");
            }
        });

    }
}