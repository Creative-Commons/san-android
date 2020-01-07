package com.sycs06.san.datetimepicker;

import android.content.DialogInterface;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.DatePicker;
import android.widget.Button;

public class datePickerpage extends AppCompatActivity {

    DatePicker dPicker;
    Button btnSubmit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_date_pickerpage);

        btnSubmit = (Button)findViewById(R.id.btnSubmit);
        dPicker = (DatePicker)findViewById(R.id.dtPicker);

        btnSubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String date = dPicker.getDayOfMonth() + "-" + (dPicker.getMonth() + 1) + "-" + dPicker.getYear();

                final AlertDialog alertDialog = new
                        AlertDialog.Builder(datePickerpage.this).create();
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
