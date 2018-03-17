package com.example.javatokotlin.kotlin

import android.util.Log

/**
 * inline extention
 * Created by pdc-k-kamiya on 2018/03/17.
 */
// extention
fun String.csvStrToList():List<String>{
    return split(",")
}

// inline
inline fun testLog(description:String){
    Log.d("DATA", description)
}

class ExtentionTest{
    init {
        val test = "リンゴ,ゴリラ,ラッパ"
        // Stringに関数が増やせる
        val csvList = test.csvStrToList()
        csvList.forEach {
            // Inline関数
            testLog(it)
        }
    }
}