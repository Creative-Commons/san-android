package com.sycs06.san.sycs06;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.content.Intent;

public class LinearActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_linear);
    }

    public void clickButton(View v){
        if(v.getId()==R.id.btnRel){
            Intent intentObj = new Intent(this, RelativeActivity.class);
            startActivity(intentObj);
        }
        else{
            Intent intentObj = new Intent(this, LinearActivity.class);
            startActivity(intentObj);
        }

    }
}
