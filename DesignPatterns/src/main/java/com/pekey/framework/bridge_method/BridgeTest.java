package com.pekey.framework.bridge_method;

public class BridgeTest {
    public static void main(String[] args) {
        Bridge bridge = new MyBridge();
        //调用第一个方法
        Sourceable source1 = new SourceSub1();
        bridge.setSource(source1);
        bridge.method();
        //调用第二个方法
        Sourceable source2 = new SourceSub2();
        bridge.setSource(source2);
        bridge.method();
    }
}
