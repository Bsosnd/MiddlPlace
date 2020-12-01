package com.example.midpoint;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends BaseActivity {
    private Button mid_button;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mid_button = findViewById(R.id.mid_button);
        mid_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), MiddlePlaceActivity.class);
                startActivity(intent);
                //startProgress();
            }
        });
    }

    private void startProgress() {

        progressON("Loading...");

//        new Handler().postDelayed(new Runnable() {
//            @Override
//            public void run() {
//                progressOFF();
//            }
//        }, 100000000);

        new android.os.Handler().postDelayed(
                new Runnable() {
                    public void run() {
                        progressOFF();
                    }
                }, 50000);

    }
}
