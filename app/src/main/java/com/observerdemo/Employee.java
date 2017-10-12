package com.observerdemo;

import android.util.Log;

/**
 * Created by DengJf on 2017/10/11.
 */

public class Employee implements Observer{
    private String username;

    public Employee(String username) {
        this.username = username;
    }

    @Override
    public void update(String msg) {
        Log.w("msg",username+"  收到老板的信息："+msg);
    }
}
