package com.pekey.framework.observer_method.sbserver;

public class Observer2 implements Observer {
    @Override
    public void update() {
        System.out.println("第二个观察者");
    }
}
