package com.pekey.framework.observer_method.sbserver;

public class Observer1 implements Observer {
    @Override
    public void update() {
        System.out.println("第一个观察者");
    }
}
