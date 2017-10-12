package com.observerdemo;

/**
 * Created by DengJf on 2017/10/11.
 */

public interface Subject {

    void attact(Observer observer);//观察者订阅

    void detact(Observer observer);//解除订阅

    void notify(String msg);//被观察者发布消息

}
