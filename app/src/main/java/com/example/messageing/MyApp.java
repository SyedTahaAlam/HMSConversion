package com.example.messageing;

import android.app.Application;

import com.google.firebase.FirebaseApp;

import org.xms.adapter.utils.XLoader;
import org.xms.g.utils.GlobalEnvSetting;

public class MyApp extends Application {
    @Override
    public void onCreate() {
        super.onCreate();

        GlobalEnvSetting.init(this,null,BuildConfig.FLAVOR);
        XLoader.init(this);
        if(BuildConfig.FLAVOR.equalsIgnoreCase("gms")){
            FirebaseApp.initializeApp(this);
        }
    }
}