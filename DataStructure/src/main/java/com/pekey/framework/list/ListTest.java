package com.pekey.framework.list;


import java.util.ArrayList;
import java.util.List;

/**
 * 1.是按顺序查找
 * 2.允许存储项为空
 * 3.允许多个存储项的值相等
 */
public class ListTest {
    public static void main(String[] args) {
        List list = new ArrayList();
        list.add("zero");
        list.add(null);
        list.add("two");
        list.add(null);
        list.add("three");

        System.out.println("index : " + list.indexOf("two"));

    }
}
