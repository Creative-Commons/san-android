package com.sycs06.san.datetimepicker;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.app.AlertDialog;
import android.content.DialogInterface;
import android.widget.TimePicker;
import android.widget.Button;
import android.view.View;


public class timePickerpage extends AppCompatActivity {

    TimePicker timePicker;
    Button timeSubmitbtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_time_pickerpage);

        timeSubmitbtn = (Button)findViewById(R.id.btnTimeSubmit);

        timePicker = (TimePicker)findViewById(R.id.tPicker);

        timeSubmitbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String date = timePicker.getCurrentHour() + ":" + timePicker.getCurrentMinute();

                final AlertDialog alertDialog = new
                        AlertDialog.Builder(timePickerpage.this).create();
                alertDialog.setMessage("Date: " + date);
                alertDialog.setButton(DialogInterface.BUTTON_POSITIVE,"OK", new DialogInterface.OnClickListener(){

                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                alertDialog.dismiss();
                            }

                        }
                );
                alertDialog.show();
            }
        });

    }
}
