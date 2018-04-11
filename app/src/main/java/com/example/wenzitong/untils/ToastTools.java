package com.example.wenzitong.untils;

import android.app.Application;
import android.widget.Toast;


/**
 * Created by XZY on 2017/4/4.
 * 用来简便构造Toast的工具类
 */

public class ToastTools extends Application {
    public static void ToastShow(String s) {
        Toast.makeText(MyApplication.getContext(), s, Toast.LENGTH_SHORT).show();
    }
}