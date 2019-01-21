package com.example.duanlianex.testapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {
    private CustomLoading customLoading;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        customLoading = (CustomLoading) findViewById(R.id.custom_loading);

    }
    @Override
    protected void onResume() {
        super.onResume();
        customLoading.start();
    }

    @Override
    protected void onPause() {
        super.onPause();
        if (isFinishing()){
            customLoading.release();
        }else{
            customLoading.stop();
        }

    }


    public void onStart(View view) {
        customLoading.start();
    }

    public void onStop(View view) {
        customLoading.stop();
    }
}
