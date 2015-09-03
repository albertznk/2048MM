package com.myatminsoe.MM2048;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;


public class License extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_license);
        MainActivity.statusbarColor(this);
    }


}
