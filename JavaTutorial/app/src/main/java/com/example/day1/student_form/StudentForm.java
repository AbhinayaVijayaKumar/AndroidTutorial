package com.example.day1.student_form;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

import com.example.day1.R;

public class StudentForm extends Activity implements View.OnClickListener, CompoundButton.OnCheckedChangeListener, RadioGroup.OnCheckedChangeListener {

    EditText etName,etDOB;
    Button btSave, btCancel;
    CheckBox cb1,cb2,cb3,cb4,cb5;
    RadioButton rbButton;
    RadioGroup rgGroup;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.student_form1);
        init();

    }

    private void init() {
        etName = findViewById(R.id.et_name);
        etDOB = findViewById(R.id.et_DOB);
        btSave = findViewById(R.id.bt_save);
        btCancel = findViewById(R.id.bt_cancel);
        rgGroup = findViewById(R.id.rg);
        cb1 = findViewById(R.id.cb1);
        cb2 = findViewById(R.id.cb2);
        cb3 = findViewById(R.id.cb3);
        cb4 = findViewById(R.id.cb4);
        cb5 = findViewById(R.id.cb5);


        btSave.setOnClickListener(this);
        btCancel.setOnClickListener(this);
        cb1.setOnCheckedChangeListener(this);
        cb2.setOnCheckedChangeListener(this);
        cb3.setOnCheckedChangeListener(this);
        cb4.setOnCheckedChangeListener(this);
        cb5.setOnCheckedChangeListener(this);
        rgGroup.setOnCheckedChangeListener(this);
    }

    @Override
    public void onClick(View v) {

        switch (v.getId()){
            case R.id.bt_save:
                Toast.makeText(this, "Form will be saved", Toast.LENGTH_SHORT ).show();
                break;
            case R.id.bt_cancel:
                Toast.makeText(this, "Form is Cancelled", Toast.LENGTH_SHORT ).show();
                break;
        }

    }



    @Override
    public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {

        switch (buttonView.getId()){
            case R.id.cb1:
                displaySubject("Maths", isChecked);
                break;

            case R.id.cb2:
                displaySubject("Physics", isChecked);
                break;

            case R.id.cb3:
                displaySubject("Chemistry", isChecked);

            case R.id.cb5:
                displaySubject("Computer Science", isChecked);
                break;

            case R.id.cb4:
                displaySubject("Biology", isChecked);
                break;
        }
    }

    private void displaySubject(String Subject, Boolean isChecked) {

        if(isChecked )
        {
            Toast.makeText(this, Subject + " is selected", Toast.LENGTH_SHORT ).show();
        }
        else
        {
            Toast.makeText(this, Subject + " is un-selected", Toast.LENGTH_SHORT ).show();
        }
    }

    @Override
    public void onCheckedChanged(RadioGroup group, int checkedId) {
        String msg = null;
        switch(checkedId){

            case R.id.rg_rb1:
                msg = "Male is selected";
                break;
            case R.id.rg_rb2:
                msg = "Female is selected";
                break;
        }
        Toast.makeText(this,msg,Toast.LENGTH_SHORT).show();
    }
}
