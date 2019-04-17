package com.example.day1.prac2;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.example.day1.R;


public class Screen1 extends Activity implements View.OnClickListener {

    TextView tv1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        init();
    }

    private void init() {
        tv1 = findViewById(R.id.textView);
        tv1.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        Intent nextScreen = new Intent(Screen1.this, Screen2.class);
        startActivity(nextScreen);
    }
}


