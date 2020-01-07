package com.sycs06.san.datetimepicker;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.content.Intent;

public class PickerActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

    }

    public void datePickerRouter(View button){
        Intent intentobj = new Intent(this, datePickerpage.class);
        startActivity(intentobj);
    }

    public void timePickerRouter(View button){
        Intent intentobj = new Intent(this, timePickerpage.class);
        startActivity(intentobj);
    }
}
