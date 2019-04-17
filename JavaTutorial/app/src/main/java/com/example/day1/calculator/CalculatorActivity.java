package com.example.day1.calculator;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

import com.example.day1.R;

public class CalculatorActivity extends Activity {

    Spinner sp;
    EditText etValueofX, etValueofY;
    TextView tvResult;
    Button bt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.calculator1);
        init();
    }

    private void init() {
        sp = findViewById(R.id.sp_1);
        etValueofX = findViewById(R.id.et_x);
        etValueofY = findViewById(R.id.et_y);
        tvResult = findViewById(R.id.tv_output);
        bt = findViewById(R.id.bt_calculate);
    }

    public void calculate(View v){
        String valueofX, valueofY;
        valueofX = etValueofX.getText().toString();
        valueofY = etValueofY.getText().toString();
        int x = Integer.parseInt(valueofX);
        int y = Integer.parseInt(valueofY);
        int result = 0;

        switch(sp.getSelectedItemPosition()){
            case 0:
                result = x + y;
                break;
            case 1:
                result = x - y;
                break;
            case 2:
                result = x * y;
                break;
        }

        tvResult.setText("The result is " +result );
    }
}
