package com.example.javatokotlin.kotlin

import android.os.Handler
import android.util.Log

/**
 * EventCallback
 * Created by pdc-k-kamiya on 2018/03/17.
 */
class EventCallback(callback:(() -> Unit)){
    init {
        // 1秒後に実行
        Handler().postDelayed({ callback.invoke() }, 1000)
    }
}

class EventControl{
    init {
        EventCallback(callback = { Log.d("Callback", "Callback") })
    }
}