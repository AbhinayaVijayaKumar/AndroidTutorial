package com.example.day1.prac1;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.example.day1.R;

public class PracActivity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.prac2_main);
    }

   public void userClickMessage(View v){

       Toast.makeText(this,"This is tutorial practice 2",Toast.LENGTH_LONG).show();

   }


}
