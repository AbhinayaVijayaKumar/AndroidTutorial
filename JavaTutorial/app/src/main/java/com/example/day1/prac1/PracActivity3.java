package com.example.day1.prac1;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.example.day1.R;

public class PracActivity3 extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.prac3_main);
    }

    public void userClickMessage(View v){

        switch(v.getId()) {

            case R.id.click1:
                Toast.makeText(this, "Button 1 clicked", Toast.LENGTH_LONG ).show();
                break;

            case R.id.click2:
                Toast.makeText(this, "Button 2 clicked", Toast.LENGTH_LONG ).show();
                break;

        }

    }
}
