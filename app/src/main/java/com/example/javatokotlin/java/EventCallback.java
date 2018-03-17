package com.example.javatokotlin.java;

import android.os.Handler;
import android.util.Log;

/**
 * EventCallback
 * Created by pdc-k-kamiya on 2018/03/17.
 */
public class EventCallback {

    public interface Callback{
        void onCall();
    }

    private Callback mCallback;

    public EventCallback(Callback callback) {
        mCallback = callback;
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                mCallback.onCall();
            }
        }, 1000);
    }
}

class EventControl{
    public EventControl() {
        new EventCallback(new EventCallback.Callback() {
            @Override
            public void onCall() {
                Log.d("Callback", "Callback");
            }
        });
    }
}