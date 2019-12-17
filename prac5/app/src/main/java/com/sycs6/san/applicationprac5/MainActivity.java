package com.sycs6.san.applicationprac5;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;


public class MainActivity extends AppCompatActivity {

    Button submitbtn;
    EditText name;
    EditText passwordTxt;
    EditText passwordNum;
    EditText email;

    RadioGroup radioGroup;
    RadioButton male; RadioButton female;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        submitbtn = (Button)findViewById(R.id.submit);
        name = (EditText)findViewById(R.id.name);
        passwordTxt = (EditText)findViewById(R.id.password);
        passwordNum = (EditText)findViewById(R.id.numpassword);
        email = (EditText)findViewById(R.id.email);

    }
}
