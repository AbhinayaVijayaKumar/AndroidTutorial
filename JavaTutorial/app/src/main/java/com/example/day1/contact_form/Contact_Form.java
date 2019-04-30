package com.example.day1.contact_form;

import android.app.Activity;
import android.app.DatePickerDialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

import com.example.day1.R;

import java.util.Calendar;

public class Contact_Form extends Activity implements View.OnClickListener {

    EditText et_Date;
    DatePickerDialog picker;
    Spinner sp1, sp2, sp3, sp4;
    TextView tv_back;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.contact_form1);
        init();
    }

    private void init() {
        sp1 = findViewById(R.id.sp_phone);
        sp2 = findViewById(R.id.sp_email);
        sp3 = findViewById(R.id.sp_address);
        sp4 = findViewById(R.id.sp_save);
        et_Date = findViewById(R.id.et_date);
        et_Date.setOnClickListener(this);
        tv_back = findViewById(R.id.tv_back);
        tv_back.setOnClickListener(this);

        String[] phone = new String[]{
                "Home",
                "Work",
                "Mobile"
        };

        String[] email = new String[]{
                "Personal",
                "Work"
        };

        String[] address = new String[]{
                "Home",
                "Work"
        };

        String[] saveTo = new String[]{
                "Sim",
                "Phone"
        };

        ArrayAdapter<String> spinner1 = new ArrayAdapter<String>(this, R.layout.spinner_contactform, phone);
        spinner1.setDropDownViewResource(R.layout.spinner_contactform);
        sp1.setAdapter(spinner1);

        ArrayAdapter<String> spinner2 = new ArrayAdapter<String>(this, R.layout.spinner_contactform, email);
        spinner2.setDropDownViewResource(R.layout.spinner_contactform);
        sp2.setAdapter(spinner2);

        ArrayAdapter<String> spinner3 = new ArrayAdapter<String>(this, R.layout.spinner_contactform, address);
        spinner3.setDropDownViewResource(R.layout.spinner_contactform);
        sp3.setAdapter(spinner3);

        ArrayAdapter<String> spinner4 = new ArrayAdapter<String>(this, R.layout.spinner_contactform, saveTo);
        spinner4.setDropDownViewResource(R.layout.spinner_contactform);
        sp4.setAdapter(spinner4);
    }

    @Override
    public void onClick(View v) {

        switch (v.getId()) {
            case R.id.tv_back:
                Intent intent1 = new Intent(Contact_Form.this, HomeScreen.class);
                startActivity(intent1);
                break;
            case R.id.et_date:
                final Calendar calender = Calendar.getInstance();
                int day = calender.get(Calendar.DAY_OF_MONTH);
                int month = calender.get(Calendar.MONTH);
                int year = calender.get(Calendar.YEAR);

                picker = new DatePickerDialog(Contact_Form.this, new DatePickerDialog.OnDateSetListener() {
                    @Override
                    public void onDateSet(DatePicker view, int year, int month, int dayOfMonth) {
                        et_Date.setText(dayOfMonth + "/" + (month + 1) + "/" + year);
                    }
                }, year, month, day);

                picker.show();
                break;
        }
    }
}
