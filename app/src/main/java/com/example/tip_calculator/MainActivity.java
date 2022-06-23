package com.example.tip_calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class MainActivity extends AppCompatActivity {

    private EditText billA;
    private EditText customA;
    private TextView total;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        billA = (EditText) findViewById(R.id.billA);
        customA = (EditText) findViewById(R.id.customA);
        total = (TextView) findViewById(R.id.total);

    }

    public void btnCUS(View view) {
        double n1 = Integer.parseInt(customA.getText().toString());
        double n2 = Integer.parseInt(billA.getText().toString());



        double x = n1 / 100;


        double sum = n2 * x;
        BigDecimal bd = new BigDecimal(sum).setScale(2, RoundingMode.HALF_UP);
        total.setText(String.valueOf(sum));
    }

    public void btn15(View view) {
        int n1 = Integer.parseInt(billA.getText().toString());
        double sum = n1 * .15;
        BigDecimal bd = new BigDecimal(sum).setScale(2, RoundingMode.HALF_UP);
        total.setText(String.valueOf(bd));
    }

    public void btn20(View view) {
        int n1 = Integer.parseInt(billA.getText().toString());
        double sum = n1 * .2;
        BigDecimal bd = new BigDecimal(sum).setScale(2, RoundingMode.HALF_UP);
        total.setText(String.valueOf(bd));
    }

    public void btn10(View view) {
        int n1 = Integer.parseInt(billA.getText().toString());
        double sum = n1 * .1;
        BigDecimal bd = new BigDecimal(sum).setScale(2, RoundingMode.HALF_UP);
        total.setText(String.valueOf(bd));
    }

    public void clear(View view) {
        billA.getText().clear();
        customA.getText().clear();
        total.setText("RESULT");

    }
}