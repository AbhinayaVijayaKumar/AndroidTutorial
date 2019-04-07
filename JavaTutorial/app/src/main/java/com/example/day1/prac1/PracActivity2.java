package com.example.day1.prac1;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.example.day1.R;

public class PracActivity2 extends Activity implements View.OnClickListener {

    Button bt_new;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.prac2_main);
        init();
    }

    private void init() {

        bt_new = findViewById(R.id.button_prac2);
        bt_new.setOnClickListener(PracActivity2.this);

    }

    @Override
    public void onClick(View v) {

        Toast.makeText(this,"This is tutorial practice 2 activity 2", Toast.LENGTH_SHORT).show();

    }
}
