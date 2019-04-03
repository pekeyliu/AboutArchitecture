package com.pekey.framework.proxy_method;

public class Source implements Sourceable {
    @Override
    public void method() {
        System.out.println("代理模式实现方法");
    }
}
