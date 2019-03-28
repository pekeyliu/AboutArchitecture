package com.pekey.framework.map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/**
 * 主要通过四种方式10w次遍历Map，查看对应的速度
 * 1、增强for循环使用方便，但性能较差，不适合处理超大量级的数据。
 * 2、迭代器的遍历速度要比增强for循环快很多，是增强for循环的2倍左右。
 * 3、使用entrySet遍历的速度要比keySet快很多，是keySet的1.5倍左右
 */
public class MapTest2 {

    public static void main(String[] args) {
        // 初始化，10W次赋值
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        for (int i = 0; i < 100000; i++)
            map.put(i, i);
        /** 增强for循环，keySet迭代 **/
        long start = System.currentTimeMillis();
        for (Integer key : map.keySet()) {
            map.get(key);
        }
        long end = System.currentTimeMillis();
        System.out.println("增强for循环，keySet迭代 -> " + (end - start) + " ms");
        /** 增强for循环，entrySet迭代 */
        start = System.currentTimeMillis();
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            entry.getKey();
            entry.getValue();
        }
        end = System.currentTimeMillis();
        System.out.println("增强for循环，entrySet迭代 -> " + (end - start) + " ms");
        /** 迭代器，keySet迭代 **/
        start = System.currentTimeMillis();
        Iterator<Integer> iterator = map.keySet().iterator();
        Integer key;
        while (iterator.hasNext()) {
            key = iterator.next();
            map.get(key);
        }
        end = System.currentTimeMillis();
        System.out.println("迭代器，keySet迭代 -> " + (end - start) + " ms");
        /** 迭代器，entrySet迭代 **/
        start = System.currentTimeMillis();
        Iterator<Map.Entry<Integer, Integer>> iterator1 = map.entrySet().iterator();
        Map.Entry<Integer, Integer> entry;
        while (iterator1.hasNext()) {
            entry = iterator1.next();
            entry.getKey();
            entry.getValue();
        }
        end = System.currentTimeMillis();
        System.out.println("迭代器，entrySet迭代 -> " + (end - start) + " ms");
    }
}
