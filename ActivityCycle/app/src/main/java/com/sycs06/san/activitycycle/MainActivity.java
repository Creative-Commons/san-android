package com.sycs06.san.activitycycle;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d("Life Cycle", "onCreate");
    }

    @Override
    protected void onPause(){
        super.onPause();
        Log.d("Life Cycle", "onPause");
    }

    @Override
    protected void onStop(){
        super.onStop();
        Log.d("Life Cycle", "onStop");
    }

    @Override
    protected void onDestroy(){
        super.onDestroy();
        Log.d("Life Cycle", "onDestroy");
    }

    @Override
    protected void onResume(){
        super.onResume();
        Log.d("Life Cycle", "onResume");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d("Life Cycle", "onStart");
    }
}
