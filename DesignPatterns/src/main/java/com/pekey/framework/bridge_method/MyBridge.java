package com.pekey.framework.bridge_method;

public class MyBridge extends Bridge {
    public void method(){
        getSource().method();
    }
}
