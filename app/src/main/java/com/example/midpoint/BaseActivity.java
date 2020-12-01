package com.example.midpoint;


import androidx.appcompat.app.AppCompatActivity;

public class BaseActivity extends AppCompatActivity {


    public void progressON() {
        BaseApplication.getInstance().progressON(this, null);
    }

    public void progressON(String message) {
        System.out.println("progressON");
        BaseApplication.getInstance().progressON(this, message);
    }

    public void progressOFF() {
        BaseApplication.getInstance().progressOFF();
    }

}
