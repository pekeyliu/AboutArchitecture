package com.pekey.framework.singleton_method;

/**
 * 单例设计模式
 */
public class Singleton {

    //单例实现方式一

//    /* 私有构造方法，防止被实例化 */
//    private Singleton(){}
//
//    /* 此处使用一个内部类来维护单例 */
//    private static class SingletonFactory{
//        private static Singleton instance = new Singleton();
//    }
//    /* 获取实例 */
//    public static Singleton getInstance(){
//        return SingletonFactory.instance;
//    }
//    /* 如果该对象被用于序列化，可以保证对象在序列化前后保持一致 */
//    public Object readResolve(){
//        return getInstance();
//    }

    //单例实现方式二
    private static Singleton instance = null;

    private Singleton() {
    }

    private static synchronized void syscli() {
        if (instance == null) {
            instance = new Singleton();
        }
    }

    public static Singleton getInstance() {
        if (instance == null) {
            syscli();
        }
        return instance;
    }

    /* 如果该对象被用于序列化，可以保证对象在序列化前后保持一致 */
    public Object readResolve() {
        return getInstance();
    }
}
