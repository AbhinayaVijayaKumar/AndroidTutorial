package com.example.day1.prac1;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.example.day1.R;

public class PracActivity4 extends Activity implements View.OnClickListener {
    Button bt1, bt2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.prac4_main);
        init();
    }

    private void init() {

        bt1 = findViewById(R.id.click1);
        bt2 = findViewById(R.id.click2);
        bt1.setOnClickListener(this);
        bt2.setOnClickListener(this);


    }

    @Override
    public void onClick(View v) {

        switch(v.getId()){
            case R.id.click1:
                Toast.makeText(this, "User clicked button 1", Toast.LENGTH_SHORT ).show();
                break;

            case R.id.click2:
                Toast.makeText(this, "User clicked button 2", Toast.LENGTH_SHORT ).show();
                break;
        }

    }
}
