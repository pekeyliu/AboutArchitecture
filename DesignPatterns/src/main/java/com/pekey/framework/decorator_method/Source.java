package com.pekey.framework.decorator_method;

public class Source implements Sourceable {
    @Override
    public void method() {
        System.out.println("原始方法，并未装饰");
    }
}
