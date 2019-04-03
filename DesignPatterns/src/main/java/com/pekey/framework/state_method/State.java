package com.pekey.framework.state_method;

public class State {
    private String value;

    public void method1(){
        System.out.println("执行第一个操作!");
    }
    public void method2(){
        System.out.println("执行第二个操作!");
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}
