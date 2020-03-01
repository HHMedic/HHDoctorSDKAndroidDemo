package com.hhmedic.android.hhdoctorvideodemo.application;

import android.app.Application;

import com.hhmedic.android.hhdoctorvideodemo.activity.LocalConfig;
import com.hhmedic.android.sdk.HHDoctor;
import com.hhmedic.android.sdk.config.HHSDKOptions;

public class DoctorApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        initSDK();
    }

    private void initSDK() {

        HHSDKOptions options = new HHSDKOptions("3001"); //productId是视频医生提供方分配的产品Id
        options.isDebug = true;
        options.dev = LocalConfig.isDevelop(this);
        HHDoctor.init(getApplicationContext(), options);
    }
}
