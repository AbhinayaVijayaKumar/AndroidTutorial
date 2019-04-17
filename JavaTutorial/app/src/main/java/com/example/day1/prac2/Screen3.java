package com.example.day1.prac2;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.day1.R;


public class Screen3 extends Activity implements View.OnClickListener {

    Button b1, b2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.screen3);
        init();

    }

    private void init() {

        b1 = findViewById(R.id.click1);
        b2 = findViewById(R.id.click2);
        b1.setOnClickListener(this);
        b2.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        Intent nextScreen = null;
        switch(v.getId()){
            case R.id.click1:
                break;
            case R.id.click2:
                nextScreen = new Intent (Screen3.this, Screen1.class);
                break;
        }
        startActivity(nextScreen);

    }
}
