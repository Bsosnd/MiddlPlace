package com.example.midpoint;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.graphics.drawable.AnimationDrawable;
import android.graphics.drawable.ColorDrawable;
import android.text.TextUtils;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatDialog;

import com.bumptech.glide.Glide;

/**
 * Created by TedPark on 2017. 3. 18..
 */

public class BaseApplication extends Application {

    private static BaseApplication baseApplication;
    AppCompatDialog progressDialog;

    public static BaseApplication getInstance() {
        if(baseApplication == null){ //최초 한번만 new 연산자를 통하여 메모리에 할당한다.
            baseApplication = new BaseApplication();
        }
        return baseApplication;
    }

    @Override
    public void onCreate() {
        super.onCreate();
        baseApplication = this;
    }

    public void progressON(Activity activity, String message) {

        System.out.println("여기 들어오");
        if (activity == null || activity.isFinishing()) {
            return;
        }


        if (progressDialog != null && progressDialog.isShowing()) {
            progressSET(message);
        } else {
            progressDialog = new AppCompatDialog(activity);
            progressDialog.setCancelable(false);
            progressDialog.getWindow().setBackgroundDrawable(new ColorDrawable(android.graphics.Color.TRANSPARENT));
            progressDialog.setContentView(R.layout.progress_loading);
            progressDialog.show();

        }


        ImageView img_loading_frame = (ImageView) progressDialog.findViewById(R.id.iv_frame_loading);
        Glide.with(activity).load(R.raw.wemeetnow).into(img_loading_frame);

//        final AnimationDrawable frameAnimation = (AnimationDrawable) img_loading_frame.getBackground();
//        img_loading_frame.post(new Runnable() {
//            @Override
//            public void run() {
//                frameAnimation.start();
//            }
//        });

        TextView tv_progress_message = (TextView) progressDialog.findViewById(R.id.tv_progress_message);
        if (!TextUtils.isEmpty(message)) {
            tv_progress_message.setText(message);
        }


    }

    public void progressSET(String message) {

        if (progressDialog == null || !progressDialog.isShowing()) {
            return;
        }


        TextView tv_progress_message = (TextView) progressDialog.findViewById(R.id.tv_progress_message);
        if (!TextUtils.isEmpty(message)) {
            tv_progress_message.setText(message);
        }

    }

    public void progressOFF() {
        if (progressDialog != null && progressDialog.isShowing()) {
            progressDialog.dismiss();
        }
    }


}
