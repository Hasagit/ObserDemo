package com.observerdemo;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by DengJf on 2017/10/11.
 */

public class Boss implements Subject{
    private List<Observer>observers;
    public Boss() {
        observers=new ArrayList<>();
    }

    //订阅消息
    @Override
    public void attact(Observer observer) {
        observers.add(observer);
    }

    //解除订阅
    @Override
    public void detact(Observer observer) {
        for (int i=0;i<observers.size();i++){
            if (observer.equals(observers.get(i)))
            observers.remove(i);
        }
    }

    //发布消息
    @Override
    public void notify(String msg) {
        for (int i=0;i<observers.size();i++){
            observers.get(i).update(msg);
        }
    }
}
