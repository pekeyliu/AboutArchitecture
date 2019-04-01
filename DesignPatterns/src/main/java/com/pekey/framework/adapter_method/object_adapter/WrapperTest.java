package com.pekey.framework.adapter_method.object_adapter;

import com.pekey.framework.adapter_method.class_adapter.Source;
import com.pekey.framework.adapter_method.class_adapter.Targetable;

/**
 * 对象适配器测试方法
 */
public class WrapperTest {
    public static void main(String[] args) {
        Targetable wrapper = new Wrapper(new Source());
        wrapper.method1();
        wrapper.method2();

    }
}
