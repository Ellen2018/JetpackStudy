package com.ellen.jetpackstudy.lifecycle;

import android.app.Activity;
import android.util.Log;
import android.widget.Toast;

import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleObserver;
import androidx.lifecycle.OnLifecycleEvent;

public class HomeLifeCycle implements LifecycleObserver {

    public HomeLifeCycle(Activity context){
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_CREATE)
    public void onCreate(){
        Log.e("Ellen2018","home->onCreate执行");
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_PAUSE)
    public void onPause(){
        Log.e("Ellen2018","home->onPause执行");
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_START)
    public void onStart(){
        Log.e("Ellen2018","home->onStart执行");
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_RESUME)
    public void onResume(){
        Log.e("Ellen2018","home->onResume执行");
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_STOP)
    public void onStop(){
        Log.e("Ellen2018","home->onStop执行");
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_DESTROY)
    public void onDestroy(){
        Log.e("Ellen2018","home->onDestroy执行");
    }

}
