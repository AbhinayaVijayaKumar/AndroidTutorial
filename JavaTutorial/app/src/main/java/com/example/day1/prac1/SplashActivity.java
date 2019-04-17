package com.example.day1.prac1;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

import com.example.day1.R;


public class SplashActivity extends Activity {

    long timeInterval=3*1000;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent1;
                intent1 = new Intent(SplashActivity.this, PracActivity4.class);
                startActivity(intent1);
            }
        }, timeInterval);
    }
}
