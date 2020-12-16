package com.ellen.jetpackstudy;

import android.app.Application;

import androidx.lifecycle.ProcessLifecycleOwner;

import com.ellen.jetpackstudy.lifecycle.AppLifeCycle;

public class App extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        ProcessLifecycleOwner.get().getLifecycle().addObserver(new AppLifeCycle());
    }

}
