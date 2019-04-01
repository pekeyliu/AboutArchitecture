package com.pekey.framework.adapter_method.object_adapter;

import com.pekey.framework.adapter_method.class_adapter.Source;
import com.pekey.framework.adapter_method.class_adapter.Targetable;

/**
 * 对象的适配器模式
 * 在适配器类中增加 source属性，在实现Targetable 的接口中（未实现的方法）通过source的实现方法来实现
 */
public class Wrapper implements Targetable {
    private Source source;
    public Wrapper(Source source){
        super();
        this.source = source;
    }


    @Override
    public void method1() {
        source.method1();
    }

    @Override
    public void method2() {
        System.out.println("对象的适配器模式");
    }
}
