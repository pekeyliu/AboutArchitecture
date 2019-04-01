package com.pekey.framework.adapter_method.class_adapter;

/**
 * 类的适配器模式
 * 接口中的部分方法由继承的父类来实现；
 * 真实的是：Adapter 想实现 source 里的功能，可以继承sorce，且在Targetable 中增加相同的方法来实现
 */
public class Adapter extends Source implements Targetable {

    @Override
    public void method2() {
        System.out.println("this is the targetable method!");
    }
}
