package com.sycs06.san.datetimepicker;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.content.Intent;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void keyboard(View button){
        Intent intentobj = new Intent();
    }

    public void alertfunc(View button){
        Intent intentobj = new Intent(this, AlertActivity.class);
        startActivity(intentobj);
    }

    public void pickerfunc(View button){
        Intent intentobj = new Intent(this, PickerActivity.class);
        startActivity(intentobj);
    }
}
