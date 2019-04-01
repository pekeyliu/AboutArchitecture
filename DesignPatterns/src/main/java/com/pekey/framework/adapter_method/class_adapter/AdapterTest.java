package com.pekey.framework.adapter_method.class_adapter;

public class AdapterTest {
    public static void main(String[] args) {
        Targetable target = new Adapter();
        target.method1();
        target.method2();
    }
}
