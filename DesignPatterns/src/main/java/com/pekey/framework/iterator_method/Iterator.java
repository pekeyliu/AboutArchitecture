package com.pekey.framework.iterator_method;

public interface Iterator {
    //上一个元素
    public Object previous();
    //下一个元素
    public Object next();
    //判断是是否有下一个元素
    public boolean hasNext();
    //获取第一个元素
    public Object first();

}
