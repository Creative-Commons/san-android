package com.sycs06.san.sycs06;

import android.os.Bundle;
import android.app.Activity;
import android.view.View;
import android.content.Intent;
import android.widget.Button;
import android.widget.Toast;


public class MainActivity extends Activity {
    Button btnFrame;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        /*btnFrame = (Button) findViewById(R.id.btnFrame);
        btnFrame.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this,"Button Click", Toast.LENGTH_SHORT).show();
            }
        });*/
    }

    public void clickButton(View button){
        Intent intentObj = new Intent(this, LinearActivity.class);
        startActivity(intentObj);
    }

    public void frameClick(View Button){
        Intent intentObj = new Intent(this, FrameActivity.class);
        startActivity(intentObj);
    }
    public void tableClick(View Button){
        Intent intentObj = new Intent(this, TableActivity.class);
        startActivity(intentObj);
    }

}
