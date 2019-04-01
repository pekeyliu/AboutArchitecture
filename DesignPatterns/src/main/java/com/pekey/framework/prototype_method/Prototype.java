package com.pekey.framework.prototype_method;

import java.io.*;

/**
 * 原形模式
 */
public class Prototype implements Cloneable, Serializable {


    private static final long serialVersionUID = 1L;

    private String str;
    private SerializableObject obj;

    /* 浅复制 */
    public Object clone() throws CloneNotSupportedException {
        Prototype proto = (Prototype) super.clone();
        return proto;
    }

    /* 深复制 */
    public Object deepClone() throws IOException, ClassNotFoundException {
        /* 写入当前对象的二进制流 */
        ByteArrayOutputStream bos = new ByteArrayOutputStream();
        ObjectOutputStream oos = new ObjectOutputStream(bos);
        oos.writeObject(this);
        /* 读出二进制流产生的新对象 */
        ByteArrayInputStream bis = new ByteArrayInputStream(bos.toByteArray());
        ObjectInputStream ois = new ObjectInputStream(bis);
        return ois.readObject();
    }
    public String getString() {
        return str;
    }
    public void setString(String string) {
        this.str = string;
    }

    public SerializableObject getObj() {
        return obj;
    }
    public void setObj(SerializableObject obj) {
        this.obj = obj;
    }
}

class SerializableObject implements Serializable {
    private static final long serialVersionUID = 1L;
}