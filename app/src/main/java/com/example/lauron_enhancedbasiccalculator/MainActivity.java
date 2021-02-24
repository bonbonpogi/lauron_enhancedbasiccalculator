package com.example.lauron_enhancedbasiccalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button buttonadd, buttonmin, buttondiv, buttonmul, buttonmod;
        EditText txtoperand1, txtoperand2;
        TextView textresult;

        buttonadd = findViewById(R.id.buttonadd);
        buttonmin = findViewById(R.id.buttonmin);
        buttondiv = findViewById(R.id.buttondiv);
        buttonmul = findViewById(R.id.buttonmul);
        buttonmod = findViewById(R.id.buttonmod);

        txtoperand1 = findViewById(R.id.txtoperand1);
        txtoperand2 = findViewById(R.id.txtoperand2);

        textresult = findViewById(R.id.textresult);

        buttonadd.setOnClickListener(this);
        buttonmin.setOnClickListener(this);
        buttondiv.setOnClickListener(this);
        buttonmul.setOnClickListener(this);
        buttonmod.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        EditText txtoperand1, txtoperand2;
        TextView textresult;

        txtoperand1 = findViewById(R.id.txtoperand1);
        txtoperand2 = findViewById(R.id.txtoperand2);
        textresult = findViewById(R.id.textresult);

        Double operand1 = 0.0;
        Double operand2 = 0.0;


        operand1 = Double.parseDouble(txtoperand1.getText().toString());
        operand2 = Double.parseDouble(txtoperand2.getText().toString());

        switch (v.getId()) {
            case R.id.buttonadd:
                textresult.setText(Double.toString(doAddition(operand1, operand2)));

                break;
            case R.id.buttonmin:
                textresult.setText(Double.toString(doSubtraction(operand1, operand2)));

                break;
            case R.id.buttonmul:
                textresult.setText(Double.toString(doMultiplication(operand1, operand2)));

                break;
            case R.id.buttondiv:
                textresult.setText(Double.toString(doDivision(operand1, operand2)));
                break;

            case R.id.buttonmod:
                textresult.setText(Double.toString(doModulo(operand1, operand2)));
                break;

        }
    }

    public static double doAddition(double operand1, double operand2) {
        return operand1 + operand2;
    }

    public static double doSubtraction(double operand1, double operand2) {
        return operand1 - operand2;
    }

    public static double doMultiplication(double operand1, double operand2) {
        return operand1 * operand2;
    }

    public static double doDivision(double operand1, double operand2) {
        return operand1 / operand2;
    }

    public static double doModulo(double operand1, double operand2) {
        return operand1 % operand2;
    }
}
