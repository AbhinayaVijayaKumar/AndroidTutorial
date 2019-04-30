package com.example.day1.contact_form;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.example.day1.R;

public class HomeScreen extends Activity implements View.OnClickListener {

    TextView tv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.home_screen);
        init();

    }

    private void init() {
        tv = findViewById(R.id.textView);
        tv.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        Intent newScreen = new Intent(HomeScreen.this, Contact_Form.class);
        startActivity(newScreen);
    }
}
