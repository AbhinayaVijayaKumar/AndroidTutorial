package com.example.day1;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;


public class MainActivity extends Activity implements View.OnClickListener {

    Button btFirst, btSecond;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_relative);
        init();

    }

    private void init(){
        btFirst = findViewById(R.id.bt_first);
        btSecond = findViewById(R.id.bt_second);

        btFirst.setOnClickListener(MainActivity.this);
        btSecond.setOnClickListener(MainActivity.this);
    }

    public void userClickMessage(View v){
    // executed when user clicks the button
    }

    @Override
    public void onClick(View v) {
        switch(v.getId()){
            case R.id.bt_first:
                Toast.makeText( this, "Button 1 Clicked", Toast.LENGTH_LONG).show();
                break;
            case R.id.bt_second:
                Toast.makeText( this, "Button 2 Clicked", Toast.LENGTH_LONG).show();
                break;
        }
    }
}


