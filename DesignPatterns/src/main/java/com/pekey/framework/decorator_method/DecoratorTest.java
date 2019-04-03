package com.pekey.framework.decorator_method;

public class DecoratorTest {
    public static void main(String[] args) {
        Sourceable source = new Source();
        Sourceable decorator = new Decorator(source);
        decorator.method();
    }
}
