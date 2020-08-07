package com.example.bdonor;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.os.Handler;
import android.preference.PreferenceManager;

public class splash extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                SharedPreferences preferences;
                preferences= PreferenceManager.getDefaultSharedPreferences(splash.this);
                startActivity(new Intent(getApplicationContext(),MainActivity.class));
                splash.this.finish();


            }
        },70);

    }
}
