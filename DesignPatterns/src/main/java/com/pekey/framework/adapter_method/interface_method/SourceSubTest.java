package com.pekey.framework.adapter_method.interface_method;

public class SourceSubTest {
    public static void main(String[] args) {
        Sourceable sourceSub1 = new SourceSub1();
        sourceSub1.method1();
        sourceSub1.method2();
        System.out.println("----------------分界线---------------");
        Sourceable sourceSub2 = new SourceSub2();
        sourceSub2.method1();
        sourceSub2.method2();
    }
}
