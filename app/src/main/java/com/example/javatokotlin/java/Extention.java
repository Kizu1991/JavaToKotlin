package com.example.javatokotlin.java;

import android.util.Log;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Utilクラスになる
 * Created by pdc-k-kamiya on 2018/03/17.
 */
public class Extention {
    public static List<String> csvStrToList(String csv){
        // Null安全では無いため、チェックをかける
        if(csv == null){
            return new ArrayList<>();
        }

        return Arrays.asList(csv.split(","));
    }
}

class TestLog {
    public static void testLog(String description){
        Log.d("Data", description);
    }
}

class ExtentionTest{
    public ExtentionTest(){
        String test = "リンゴ,ゴリラ,ラッパ";
        List<String> csv = Extention.csvStrToList(test);
        for (String data : csv){
            TestLog.testLog(data);
        }
    }
}
