package com.example.pocketfresh;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.WindowManager;

public class launch_screen extends AppCompatActivity {
        Handler h = new Handler();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_launch_screen);

        getSupportActionBar().hide();
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);

        h.postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent i = new Intent(launch_screen.this, sign_up_screen.class);
                startActivity(i);
                finish();
            }
        }, 2000);

    }
}