package com.example.day1.calculator;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import com.example.day1.R;

public class Calculator_formula extends Activity {

    Spinner sp;
    EditText etValueofA, etValueofB;
    TextView tvResult;
    TextView tvFormula;
    Button bt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.calculator2);
        init();
    }

    private void init() {
        sp = findViewById(R.id.sp_1);
        etValueofA = findViewById(R.id.et_a);
        etValueofB = findViewById(R.id.et_b);
        tvResult = findViewById(R.id.tv_output);
        tvFormula = findViewById(R.id.tv_formula);
        bt = findViewById(R.id.bt_calculate);
    }

    public void calculate(View v){
        String valueofA, valueofB;
        valueofA = etValueofA.getText().toString();
        valueofB = etValueofB.getText().toString();
        if(valueofA.length()>0&&valueofB.length()>0) {
            performOperation(valueofA, valueofB);
        }
        else
        {
            Toast.makeText(this,"Please make sure you enter both the values", Toast.LENGTH_LONG).show();
        }
    }

    private void performOperation(String valueofA, String valueofB) {
            int a = Integer.parseInt(valueofA);
            int b = Integer.parseInt(valueofB);
            double result = 0;
            String formula = null;

            switch (sp.getSelectedItemPosition()) {
                case 0:
                    result = Math.pow(a,2)+ Math.pow(b,2)+(2*a*b);
                    tvFormula.setText("The formula is a^2+b^2+2ab");
                    break;
                case 1:
                    result = Math.pow((a-b),2)+ (2*a*b);
                    tvFormula.setText("The formula is (a-b)^2+2ab");
                    break;
                case 2:
                    result = Math.pow(a,2)+ Math.pow(b,2)-(2*a*b);
                    tvFormula.setText("The formula is a^2-b^2+2ab");
                    break;
                case 3:
                    result = (a-b)*(a+b);
                    tvFormula.setText("The formula is (a-b)*(a+b)");
                    break;
                case 4:
                    result = Math.pow(a,3)+ (3*Math.pow(a,2)*b)+ (3*a*Math.pow(b,2)) + Math.pow(b,3);
                    tvFormula.setText("The formula is a^3+3a^2b+3ab^2+b^3");
                    break;
                case 5:
                    result = Math.pow(a,3) + (3*a*Math.pow(b,2)) - (3*Math.pow(a,2)*b) - Math.pow(b,3);
                    tvFormula.setText("The formula is a^3-3a^2b+3ab^2+b^3");
                    break;
            }
            tvResult.setText("The answer is " + result);
        }
    }

